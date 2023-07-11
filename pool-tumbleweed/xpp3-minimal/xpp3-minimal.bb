SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-minimal-1.1.4c-6.7.noarch.rpm"
RPM_HASH = "e4ec94e7410c46ac8f79f2ede44b53b00d351115eeecdffc6cdc1e480659a5296011a092ff382bb13a399d073f42ea75eaeb24dcff4dbeec329be47b38d44785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xpp3-xpp3-min \
mvn-xpp3-xpp3-min-pom- \
xpp3-minimal"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
