SUMMARY = "Mobile broadband device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for mobile broadband (WWAN) \
devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-wwan-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "dce4d86a83f5f94511edc36fdfd854a65bfdcb1ad5c5a36be92a278d5a68bff3d7e503aadf8fb337148127cc62469f4c4ad3ff19746926febff049c0d9f339e8"

RPROVIDES:${PN} += "NetworkManager-wwan NetworkManager-wwan(aarch-64) libnm-device-plugin-wwan.so()(64bit) libnm-wwan.so()(64bit)"
RDEPENDS:${PN} += "ModemManager NetworkManager ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmm-glib.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
