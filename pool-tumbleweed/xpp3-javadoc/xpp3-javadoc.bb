SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-javadoc-1.1.4c-6.7.noarch.rpm"
RPM_HASH = "df5d116fb0e33f4cdd2f0fa28ed40d3f147cbba1652012947a5f622e89de81b673749a878a2ecd12b98da0cfd6a50812ff35c14fe5d2c79a5a5828654e0c767f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
