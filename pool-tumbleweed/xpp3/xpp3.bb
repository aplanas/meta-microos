SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-1.1.4c-6.6.noarch.rpm"
RPM_HASH = "276bcfb610da33d32c56edadbd655387d6ba959d5343e8cbf674ec77983bd953f57ec162ca89d49b56241d3e1bbf91a05db3675529d2046efa66b206e9ab7c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xpp3-xpp3 \
mvn-xpp3-xpp3-pom- \
mvn-xpp3-xpp3-xpath \
mvn-xpp3-xpp3-xpath-pom- \
osgi-org.xmlpull \
xpp3"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
