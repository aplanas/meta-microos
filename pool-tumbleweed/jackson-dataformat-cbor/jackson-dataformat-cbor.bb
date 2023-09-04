SUMMARY = "Support for reading and writing Concise Binary Object Representation"
DESCRIPTION = "Jackson data format module that supports reading and writing CBOR ('Concise \
Binary Object Representation') encoded data. Module extends standard Jackson \
streaming API (JsonFactory, JsonParser, JsonGenerator), and as such works \
seamlessly with all the higher level data abstractions (data binding, tree \
model, and pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-cbor-2.15.2-1.1.noarch.rpm"
RPM_HASH = "aca8949188854299dba562d0686946ba1f0456271cbecb430d760c4bbd2d1d82eaf29d9b8f2025ae228c6f20c0051a5e81c4d3d0b8b37747c701330d39b45998"
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
