SUMMARY = "Headers for the unstable API of the Qt5 Quick 3D module"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 Quick 3D module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtquick3d-private-headers-devel-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "5a63b9d649c7a0c9283f74ef925e1d9c87c2bf9fc5eb5760137c6060b1143e2d74a7a4ae44677c676f587f42ffa072e625d10586efb22afaae331057be1782aa"

RPROVIDES:${PN} += "libqt5-qtquick3d-private-headers-devel \
libqt5-qtquick3d-private-headers-devel(aarch-64)"

RDEPENDS:${PN} += "libqt5-qtquick3d-devel"

inherit rpm
