SUMMARY = "GNOME Calculator Library GTK Interface"
DESCRIPTION = "This package contains a shared library for gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "libgci-1-0_0_0-44.0-1.1.aarch64.rpm"
RPM_HASH = "c71a76518397edecb7e875379548ab2384b86ba610732de4210a429584c3a4105a822918f15500d6f483e98c53fc430ad9cdcac3e61b5cf7e5f49565fe84e7e4"

RPROVIDES:${PN} += "libgci-1-0_0_0 \
libgci-1-0_0_0(aarch-64) \
libgci-1.so.0.0.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcalc-2.so.1.0.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
