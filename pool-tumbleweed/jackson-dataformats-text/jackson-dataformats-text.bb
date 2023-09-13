SUMMARY = "Jackson standard text-format data format backends"
DESCRIPTION = "Parent pom for Jackson text-format dataformats."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-text-2.15.2-2.1.noarch.rpm"
RPM_HASH = "2a7d104e7f5d79976fbd52c172c20c964dd77084ce77247a86c315b07caa34ea2d5dd7cbfd6c6cbca84e18dbe861bde4324b4085bf4949ee3f2d4fca815da897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformats-text-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core"

inherit rpm
