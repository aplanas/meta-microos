SUMMARY = "Qt library for Single Sign On"
DESCRIPTION = "This package contains the Qt library for Single Sign On."
LICENSE = "LGPL-2.1-only"

PV = "1.16"

RPM_NAME = "libaccounts-qt5-1-1.16-1.18.aarch64.rpm"
RPM_HASH = "8b1c9a8c063f669975f1c57e6c6cceef6767a8fb427f84368d7cce542812607ef0b0e3c5ee47a8bdabf39d447b79b693f1d5febb4919084986ff1411190ffde2"

RPROVIDES:${PN} += "libaccounts-qt5-1 \
libaccounts-qt5-1(aarch-64) \
libaccounts-qt5.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libaccounts-glib.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
