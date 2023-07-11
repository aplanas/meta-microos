SUMMARY = "Javadoc for xmlgraphics-commons"
DESCRIPTION = "Javadoc for package xmlgraphics-commons."
LICENSE = "Apache-2.0"

PV = "2.8"

RPM_NAME = "xmlgraphics-commons-javadoc-2.8-1.3.noarch.rpm"
RPM_HASH = "f172f04e3316edc28bdcdc855b378ad135801847bf155b351f498b741af834c4d977b12029bb72e5d335cf00f47b04cc1cf0bb256916d37fefc06c9bc1559023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlgraphics-commons-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
