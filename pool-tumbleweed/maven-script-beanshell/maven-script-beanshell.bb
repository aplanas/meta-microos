SUMMARY = "Maven Beanshell Mojo Support"
DESCRIPTION = "This package provides Maven Beanshell Mojo Support, which write Maven plugins with \
Beanshell scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-beanshell-3.6.0-5.1.noarch.rpm"
RPM_HASH = "83ab7e874d0534d5c501f356454ef73d5954771d306a6b9073e1d2f0dcaf9cf170d74e44e0a2da191bc3554fd471825d9ed3657448041262a57c773e1136e0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-beanshell \
mvn(org.apache.maven.plugin-tools:maven-script-beanshell) \
mvn(org.apache.maven.plugin-tools:maven-script-beanshell:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-bsh-factory)"

inherit rpm
