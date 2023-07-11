SUMMARY = "Jackson standard binary data format backends"
DESCRIPTION = "Parent pom for Jackson binary dataformats."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-binary-2.13.3-1.8.noarch.rpm"
RPM_HASH = "4d71ca3f8319f92fe931157e9b7473f4b66cb670fe9f104d6e8286eebb5eb3e5882f8bfb8e369ece54875a14b14083cfb7ff437078b621c94aaed23544c3f045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-binary-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
