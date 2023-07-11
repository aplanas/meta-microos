SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-1.1.4c-6.7.noarch.rpm"
RPM_HASH = "c8f00d7bb0c9969d44289b6ec674e44e03418950768bea7fb5c19bdd774f52662889672e222db7765fba67b25df9b0f4b2c31bf95e18fdcc8abde39050403909"
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
