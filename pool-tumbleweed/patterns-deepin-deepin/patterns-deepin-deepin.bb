SUMMARY = "Deepin Desktop Environment"
DESCRIPTION = "The Deepin desktop environment is a desktop environment using fashion metaphors."
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "46a0e56d78d2512f23fd259c88b95ed27f77579de4aa860a418c39340c7d21bd4fa22e01621a9dce55345eea0c78ffffc46cfefa8610f5b0c1e226d0a055f5f6"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-deepin-deepin"

RDEPENDS:${PN} += "pattern-"

inherit rpm
