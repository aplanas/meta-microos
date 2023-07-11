SUMMARY = "Documentation of librevenge API"
DESCRIPTION = "The librevenge-doc package contains documentation files for librevenge."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-doc-0.0.5-1.4.noarch.rpm"
RPM_HASH = "6a39e0c501ac48a0a006e3f68d8c0aa38310f2cff9d0641fc251fe71053d8d75ec187bd92e73137188baa123f772f866ebf5ca43e6d1525e1768f921724e8f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librevenge-doc"

RDEPENDS:${PN} += ""

inherit rpm
