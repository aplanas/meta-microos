SUMMARY = "ZBar Qt bindings"
DESCRIPTION = "This package provides ZBar Qt bindings."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbarqt0-0.23.90-4.1.aarch64.rpm"
RPM_HASH = "80bfef925da8bbde17536a23db6d9bfce97a033c69e30608d34ff47303fee413850d68ba03ce0bb5dfef456f426efab7f807d0cb10922be93747122cb0f46f7e"

RPROVIDES:${PN} += "libzbarqt.so.0 \
libzbarqt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzbar.so.0"

inherit rpm
