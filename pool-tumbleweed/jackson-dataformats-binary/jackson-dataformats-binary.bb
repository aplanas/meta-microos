SUMMARY = "Jackson standard binary data format backends"
DESCRIPTION = "Parent pom for Jackson binary dataformats."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-binary-2.15.2-1.1.noarch.rpm"
RPM_HASH = "ad751d29cba9fd093b8c1179a06dc9c80ea30b6923dea6384f786915a5c527427916d3735772a512380fb766d9ac77b3324bdd74a37d1abcc6d5c02937608fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-binary-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
