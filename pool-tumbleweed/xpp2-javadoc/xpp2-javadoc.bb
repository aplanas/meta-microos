SUMMARY = "XML Pull Parser"
DESCRIPTION = "XML Pull Parser 2 (XPP2) is a simple and fast incremental XML parser. \
NOTE: XPP2 is no longer developed and is on maintenance mode. All \
active development concentrates on its successor XPP3/MXP1"
LICENSE = "Apache-1.1"

PV = "2.1.10"

RPM_NAME = "xpp2-javadoc-2.1.10-30.6.noarch.rpm"
RPM_HASH = "7cb284fd88bc2f6d6c09721f6b06107c372ef07eb62048e12bd5eac8eec2ca4ce53447b64533891c314133141e729d84b7023cc4433a60bb0195597571f502f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp2-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
