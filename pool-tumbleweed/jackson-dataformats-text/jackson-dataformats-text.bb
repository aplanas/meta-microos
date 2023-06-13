SUMMARY = "Jackson standard text-format data format backends"
DESCRIPTION = "Parent pom for Jackson text-format dataformats."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-text-2.13.3-1.7.noarch.rpm"
RPM_HASH = "f598a22a491b9fda911f636561cc88e324d291a6d50a5eaacf35ce7e8c98cef5076b47747aed6cc64a01481ec1aa3f296956ecfe9985b42f8f113f02307d3be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text \
mvn(com.fasterxml.jackson.dataformat:jackson-dataformats-text:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson:jackson-base:pom:)"

inherit rpm
