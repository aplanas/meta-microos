SUMMARY = "Documentation how to Use Atril"
DESCRIPTION = "This package contains the documentation for atril"
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-doc-1.26.1-1.1.noarch.rpm"
RPM_HASH = "d1f97cddb21a16d58f3c459e13d9ba5338c6110301228c25d711260f2378ece30d6afa6b9a51647ddd3cad035af6233a5ca973f7778514ec7904fd2fda7fd0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atril-doc"

RDEPENDS:${PN} += "atril"

inherit rpm
