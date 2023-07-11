SUMMARY = "Development tools for deepin movie"
DESCRIPTION = "The deepin-movie-devel package contains the header files and developer docs for \
deepin movie."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "deepin-movie-devel-5.10.8-1.6.aarch64.rpm"
RPM_HASH = "c834ab4be82d46cb4ca5ad4b05d55ff962438f797514f2857a1f6adb6ae9d9a691525e187a961b972914eef59926ad00a1648663902144d91957cbb290364722"

RPROVIDES:${PN} += "deepin-movie-devel \
pkgconfig-libdmr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmr0-1 \
pkgconfig-Qt5Concurrent \
pkgconfig-Qt5Network \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5X11Extras \
pkgconfig-dtkcore \
pkgconfig-dtkwidget \
pkgconfig-gl"

inherit rpm
