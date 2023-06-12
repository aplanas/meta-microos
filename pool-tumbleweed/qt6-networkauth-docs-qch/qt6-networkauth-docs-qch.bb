SUMMARY = "Documentation for qt6-networkauth in QCH format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-networkauth-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0df76bba76c0796a59cf0e937940c725b3c81a3eb9bbafd6084c9dcc2b0115e8bf23df6a5d742a600810e430006297ca80f4ff3bc1754f385ea57731d419a251"

RPROVIDES:${PN} += "qt6-networkauth-docs-qch \
qt6-networkauth-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
