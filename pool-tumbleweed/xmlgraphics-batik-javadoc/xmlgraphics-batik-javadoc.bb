SUMMARY = "Javadoc for xmlgraphics-batik"
DESCRIPTION = "Javadoc for xmlgraphics-batik."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-javadoc-1.15-3.1.noarch.rpm"
RPM_HASH = "5f15446fcbc2a2347c3599765f3813273bb28760803cb988270c874cd7e3e3fec7240aa3bbc555a255c6233bffcb343e5d86cb79af02cdf79e88f7a42eb5371a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-javadoc \
xmlgraphics-batik-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
