SUMMARY = "Single Cmyk Profile from basICColor"
DESCRIPTION = "Printing profile according to ISO 12647-2. This is one CMYK \
ICC profile for a ISO Printing condition."
LICENSE = "Zlib"

PV = "1.2.0"

RPM_NAME = "icc-profiles-basiccolor-printing2009-coat2-1.2.0-13.17.noarch.rpm"
RPM_HASH = "853fead17a68b5cc7b29fb2aad56c3a7a9ccdd6dde742df7471f81fa1e9a684886162d09e1d1ef00d8cc243489fc49b94e9057f053fa78b34305628a2d8352fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-printing2009-coat2"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
