SUMMARY = "Miscellaneous user tools writen in Qore Programming Language"
DESCRIPTION = "This package contains tool for working with: \
 - REST APIs \
 - SQL Databases"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.18.1"

RPM_NAME = "qore-misc-tools-1.18.1-1.1.noarch.rpm"
RPM_HASH = "faa1218a9821368f0fea0927c5937d34c52af1ba0c553008b756fe000562a03d190f8dd384b73d462074978606a40f8b04e74ac830a6d3f9153d335d63cd2297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-misc-tools"

RDEPENDS:${PN} += "qore"

inherit rpm
