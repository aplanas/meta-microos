SUMMARY = "Fake graphical display for libbraille"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard. \
 \
This package contains a fake graphical virtual display."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille-fake0-14-0.19.0-24.9.aarch64.rpm"
RPM_HASH = "a2986d65f97fd53589c189319eb751b620fd02e3f2e36696dfe431d0fb9417400e53535b19344265ce76b2310db9855562d20bdf6639df2e976a41ffe472f460"

RPROVIDES:${PN} += "libbraille-fake0-14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbraille \
libbraille-0.so.14 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
