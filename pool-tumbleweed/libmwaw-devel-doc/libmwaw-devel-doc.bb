SUMMARY = "Documentation for the libmwaw API"
DESCRIPTION = "This package contains documentation for the libmwaw API."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-devel-doc-0.3.21-2.9.noarch.rpm"
RPM_HASH = "2fe1d12a5be15018f68c90d6da0bf076c6b7dbc3e5b340559784715890cdaf33ae6be8dd39c1f6eade1d517c33d313cf75e5913a5428d63cc8a4c1ccd8f2fa11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmwaw-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
