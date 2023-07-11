SUMMARY = "Headers for the unstable API of the Qt5 Quick 3D module"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 Quick 3D module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtquick3d-private-headers-devel-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "00ba8baa4b790479278ad8b9550eb0722bb9197aaac924d3fa8d0ad6e989559fbd5318594d45bb02849e005706a0e311b7f0123ddb1a0c1ba3b39a9645a39ed7"

RPROVIDES:${PN} += "libqt5-qtquick3d-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtquick3d-devel"

inherit rpm
