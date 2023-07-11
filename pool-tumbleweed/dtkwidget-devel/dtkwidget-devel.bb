SUMMARY = "Development tools for dtkwidget"
DESCRIPTION = "The dtkwidget-devel package contains the header files and developer \
docs for dtkcore."
LICENSE = "LGPL-3.0-only"

PV = "5.5.52"

RPM_NAME = "dtkwidget-devel-5.5.52-1.8.aarch64.rpm"
RPM_HASH = "114fd17b983559bdb4df759721b372a01ac06acbec60d9057c61ecd5855770be766501ea86a9f4f2e8ae7b882808f6f7b6062024ec4ec69b84ff8938692354aa"

RPROVIDES:${PN} += "cmake-DtkWidget \
dtkwidget-devel \
pkgconfig-dtkwidget"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdtkwidget5 \
pkgconfig-dtkcore \
pkgconfig-dtkgui"

inherit rpm
