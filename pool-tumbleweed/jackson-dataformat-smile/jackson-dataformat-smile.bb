SUMMARY = "Support for reading and writing Smile encoded data using Jackson abstractions"
DESCRIPTION = "This Jackson extension handles reading and writing of data encoded in Smile \
data format ('binary JSON'). It extends standard Jackson streaming API \
(JsonFactory, JsonParser, JsonGenerator), and as such works seamlessly with \
all the higher level data abstractions (data binding, tree model, and \
pluggable extensions)."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-smile-2.13.3-1.8.noarch.rpm"
RPM_HASH = "a184d6dc3c2de2856b649f03f13c94c401addca2584c10d290279b909e7ff4687d6c5f97f3ed3b209d9e530503c32be0f679f0626bae474f80b317dea3ed6b7a"
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
