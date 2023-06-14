SUMMARY = "Guitarix runtime library"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.1"

RPM_NAME = "libgxwmm0-0.44.1-2.2.aarch64.rpm"
RPM_HASH = "22324afabc64fe5c254c6785014b736f2a3e4e5d188e65841368d8d12d59a93503b68a1fc1cdc0ebff50e022ec8a0e2c5635160d26d0ce563ab9aa0068ba77d0"

RPROVIDES:${PN} += "libgxwmm.so.0 \
libgxwmm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtkmm-3.0.so.1 \
libgxw.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
