SUMMARY = "Support for reading and writing Smile encoded data using Jackson abstractions"
DESCRIPTION = "This Jackson extension handles reading and writing of data encoded in Smile \
data format ('binary JSON'). It extends standard Jackson streaming API \
(JsonFactory, JsonParser, JsonGenerator), and as such works seamlessly with \
all the higher level data abstractions (data binding, tree model, and \
pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-smile-2.15.2-2.1.noarch.rpm"
RPM_HASH = "3dd86389a722730bcfbd9f801f46a3b92a04c19f325827a6ba9e994293b2d14abdece23051dcaf6d35f167283cc4800ac25195ef820c416a06cedd08c6b697e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-smile \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-smile \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-smile-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-smile"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
