SUMMARY = "Parent POM file for Apache projects"
DESCRIPTION = "This package contains the parent pom file for apache projects."
LICENSE = "Apache-2.0"

PV = "28"

RPM_NAME = "apache-parent-28-1.2.noarch.rpm"
RPM_HASH = "d35d4898eeb0797c4c8c32abb4413ddd95055cb09cf2da108ce523dce6239d591a50e6d98ec861ea548391e05c1dccd48b4d1f1f9ce04694973468f574365847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-parent \
mvn-org.apache-apache-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
