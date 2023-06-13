SUMMARY = "Guitarix runtime library"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "libgxwmm0-0.44.1-2.2.aarch64.rpm"
RPM_HASH = "22324afabc64fe5c254c6785014b736f2a3e4e5d188e65841368d8d12d59a93503b68a1fc1cdc0ebff50e022ec8a0e2c5635160d26d0ce563ab9aa0068ba77d0"

RPROVIDES:${PN} += "libgxwmm.so.0()(64bit) \
libgxwmm0 \
libgxwmm0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libgxw.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
