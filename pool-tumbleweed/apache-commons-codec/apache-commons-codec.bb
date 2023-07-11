SUMMARY = "Apache Commons Codec Package"
DESCRIPTION = "Commons Codec is an attempt to provide definitive implementations of \
commonly used encoders and decoders."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "apache-commons-codec-1.15-2.5.noarch.rpm"
RPM_HASH = "2025a423ef3fa2a688f9f0a9c97fbaf7038ea73df462d1e2951196694df312e6c89e120521e702fb273e7a0d7267b4f4d1f1f4db36bd9d6f3126a77c8b69fa40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-codec \
commons-codec \
jakarta-commons-codec \
mvn-commons-codec-commons-codec \
mvn-commons-codec-commons-codec-pom- \
osgi-org.apache.commons.codec"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
