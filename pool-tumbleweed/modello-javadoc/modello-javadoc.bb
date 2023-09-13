SUMMARY = "Javadoc for modello"
DESCRIPTION = "API documentation for modello."
LICENSE = "Apache-2.0 & MIT"

PV = "2.1.2"

RPM_NAME = "modello-javadoc-2.1.2-1.1.noarch.rpm"
RPM_HASH = "32f012d5eab00b3c1fc63d2588cb7d3e3fe28d75171c47bff63efc4a06aacba73cab1257eab7b0759b5d509103a4110f1b13f25b377f74b2cafd3b05fb223f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
