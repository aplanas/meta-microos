SUMMARY = "Courier Unicode Library - Docs and man pages"
DESCRIPTION = "This package contains the docs and the man pages of the Courier Unicode Library"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.6"

RPM_NAME = "courier-unicode-doc-2.2.6-1.3.noarch.rpm"
RPM_HASH = "3d4104fae6727901ad8f4ed901a2342ce8f45642d0b8da1972845f77aab8cab318c3a5cdfd0c1ddb42742e5776b1553518335de06d8200f425a17bd9a27f2292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "courier-unicode-doc"
RDEPENDS:${PN} += ""

inherit rpm
