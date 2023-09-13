SUMMARY = "Support for reading and writing Concise Binary Object Representation"
DESCRIPTION = "Jackson data format module that supports reading and writing CBOR ('Concise \
Binary Object Representation') encoded data. Module extends standard Jackson \
streaming API (JsonFactory, JsonParser, JsonGenerator), and as such works \
seamlessly with all the higher level data abstractions (data binding, tree \
model, and pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-cbor-2.15.2-2.1.noarch.rpm"
RPM_HASH = "fb7dc0b5b27a15a9b7a6ecdd7ffb71b90d149bf12e1004e290a5e1bf3c6341bccb1ca98fc77dd9a088c18c072d1491aa774dfe825429987a01024a70a724c792"
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
