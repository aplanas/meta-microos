SUMMARY = "Jackson standard text-format data format backends"
DESCRIPTION = "Parent pom for Jackson text-format dataformats."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-text-2.13.3-1.8.noarch.rpm"
RPM_HASH = "1a672792b108b5a36be911b059bdfa1dfedd6fb73c8b60a0cdce49c8008f9b8acdba2414f7b932c3c438a5acacc444252626e70b3ef8cc60714ef046bd8246dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-text-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
