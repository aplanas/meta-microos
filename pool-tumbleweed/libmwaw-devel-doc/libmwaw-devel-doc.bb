SUMMARY = "Documentation for the libmwaw API"
DESCRIPTION = "This package contains documentation for the libmwaw API."
LICENSE = "GPL-2.0-or-later & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.3.21"

RPM_NAME = "libmwaw-devel-doc-0.3.21-2.10.noarch.rpm"
RPM_HASH = "559fd655eb2d670ab760c30c19296ad3a045fcefbd7c6f6652769988237cf881dfa5bc52163d4df3468816c5dc42ae79059b1309e3bfa0ee1ddff27a3a08cf8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmwaw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
