SUMMARY = "Support for reading and writing Concise Binary Object Representation"
DESCRIPTION = "Jackson data format module that supports reading and writing CBOR ('Concise \
Binary Object Representation') encoded data. Module extends standard Jackson \
streaming API (JsonFactory, JsonParser, JsonGenerator), and as such works \
seamlessly with all the higher level data abstractions (data binding, tree \
model, and pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-cbor-2.13.3-1.7.noarch.rpm"
RPM_HASH = "a1db1431f8823da8753416c0fefd8aecfdcce2466eae21ef1944d6e67273ac62065b0a115f1b42d19069767f0defda4faaa04d8b8212851abea3ed3c75e56ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-cbor \
mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-cbor) \
mvn(com.fasterxml.jackson.dataformat:jackson-dataformat-cbor:pom:) \
osgi(com.fasterxml.jackson.dataformat.jackson-dataformat-cbor)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind)"

inherit rpm
