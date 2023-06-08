SUMMARY = "Command Line Interface Library for Java"
DESCRIPTION = "The CLI library provides an API for working with the \
command line arguments and options."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "apache-commons-cli-1.5.0-1.7.noarch.rpm"
RPM_HASH = "bda2d2070505f647109e4137f1a2ea9edbcf656dd6ff202f7e83994aa610cebc11e4fc1cd2bd3dbf150924c7010308cd83084094788c247c1a5a0352a86fc0a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-cli apache-commons-cli jakarta-commons-cli mvn(commons-cli:commons-cli) mvn(commons-cli:commons-cli:pom:) mvn(org.apache.commons:commons-cli) mvn(org.apache.commons:commons-cli:pom:) osgi(org.apache.commons.cli)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
