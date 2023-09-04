SUMMARY = "Jackson standard text-format data format backends"
DESCRIPTION = "Parent pom for Jackson text-format dataformats."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-text-2.15.2-1.1.noarch.rpm"
RPM_HASH = "76023dee463ecf40724c49409a3111ff5dc447f13aaa0238ec2a41d3f8249108d674a57f22c415570d35218d26d7ab58206f154e81c41a36ad27db2ebb2fa9de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-text-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
