SUMMARY = "Base theme for the Pagure web interface"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the base upstream look and feel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-upstream-5.13.3-1.4.noarch.rpm"
RPM_HASH = "38bb35c1f239874285050863070d887db7c0e8e76da676f66a6615637d9981eb363789f6d905344479e46dfc6fa24b19234da0d77ca1d1b63f2a24dc5ff792bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-upstream"

RDEPENDS:${PN} += "pagure"

inherit rpm
