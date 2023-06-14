SUMMARY = "Jackson standard binary data format backends"
DESCRIPTION = "Parent pom for Jackson binary dataformats."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-binary-2.13.3-1.7.noarch.rpm"
RPM_HASH = "1863f5a4dfcde68de3562a6541a96f96a54bd6f7ab0ba6a20cd0c7f8208b156e65e8bec174a67cbe5114152050a67e82b103c616abc8caf32eef087ff7d4654d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-binary-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
