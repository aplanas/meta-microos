SUMMARY = "Development tools for Deepin Anything"
DESCRIPTION = "The udisks2-qt5-devel package contains the header files and developer \
docs for udisks2-qt5."
LICENSE = "LGPL-3.0+"

PV = "5.0.6"

RPM_NAME = "udisks2-qt5-devel-5.0.6-1.9.aarch64.rpm"
RPM_HASH = "30efd1778c2a9eb113ab06949ca12cadd9c386f7712a825be1ecc6ac57326a7d2f38178f8fc6bc27bd8ef78ff9f892e587781aea84353e7ad46d52a38075dad2"

RPROVIDES:${PN} += "pkgconfig-udisks2-qt5 \
udisks2-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libudisks2-qt5-0"

inherit rpm
