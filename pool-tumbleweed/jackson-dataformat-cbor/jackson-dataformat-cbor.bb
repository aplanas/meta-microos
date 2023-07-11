SUMMARY = "Support for reading and writing Concise Binary Object Representation"
DESCRIPTION = "Jackson data format module that supports reading and writing CBOR ('Concise \
Binary Object Representation') encoded data. Module extends standard Jackson \
streaming API (JsonFactory, JsonParser, JsonGenerator), and as such works \
seamlessly with all the higher level data abstractions (data binding, tree \
model, and pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-cbor-2.13.3-1.8.noarch.rpm"
RPM_HASH = "ad10b02a41e598d969312ef7a89f2e996eabfe8bb0cb902907fe1b4eac672bcca934201436f434de6d2e9a8a99b09d9329850d5f3c65ba58f8d9d1927bf3c279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-cbor \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-cbor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
