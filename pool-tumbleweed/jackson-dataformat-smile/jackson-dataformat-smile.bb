SUMMARY = "Support for reading and writing Smile encoded data using Jackson abstractions"
DESCRIPTION = "This Jackson extension handles reading and writing of data encoded in Smile \
data format ('binary JSON'). It extends standard Jackson streaming API \
(JsonFactory, JsonParser, JsonGenerator), and as such works seamlessly with \
all the higher level data abstractions (data binding, tree model, and \
pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-smile-2.15.2-1.1.noarch.rpm"
RPM_HASH = "046a261e53f16af80c9d17d8aba87c0649ddd211593f6712adff251b09af05e727dfa98a11743057e3e61417dcc1e67745f4f7d92b80541bc6e05d805b624649"
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
