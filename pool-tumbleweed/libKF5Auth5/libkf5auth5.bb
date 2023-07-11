SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Auth5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "d7f767448ffd884962f4f15cc3ba3a719faa6af9294cf83ca31e3943be1f45f6443b2f2bd506cc239b93a1d9040fcc191545d21fb27acce3a619badff160cced"

RPROVIDES:${PN} += "libKF5Auth.so.5 \
libKF5Auth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5AuthCore5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
