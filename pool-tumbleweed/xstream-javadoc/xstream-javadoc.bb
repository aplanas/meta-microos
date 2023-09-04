SUMMARY = "Javadoc for xstream"
DESCRIPTION = "xstream API documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-javadoc-1.4.20-2.1.noarch.rpm"
RPM_HASH = "58c4a0b4b1e0da346f565c2af67ed45e49dcb770ed5a11c056c83c549052a79bfc60c0248aed4a361f12280382d67ab974b0712ee0e44a2cd54e793370457d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xstream-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
