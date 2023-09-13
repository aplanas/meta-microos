SUMMARY = "Jackson standard binary data format backends"
DESCRIPTION = "Parent pom for Jackson binary dataformats."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-binary-2.15.2-2.1.noarch.rpm"
RPM_HASH = "c0dccb021b2d3b08c6e7a1e959493374b443cec58b8b9f2e9c73d6985f9fee19041f63197f5401adde197d36ef55aef41b5cc1940d27c0eff4a80ed06eba36b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-binary-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
