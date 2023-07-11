SUMMARY = "Javadoc for stax-ex"
DESCRIPTION = "This package contains javadoc for stax-ex."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "1.8"

RPM_NAME = "stax-ex-javadoc-1.8-4.5.noarch.rpm"
RPM_HASH = "d27b92de054a3b57d661b2da7dd2af7678f0e1e54a8b71d383d20f51f0305651687d89017b69e83b3212fa33109e6669e8ca2b3c296a3ab393dfe2d881fbe201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax-ex-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
