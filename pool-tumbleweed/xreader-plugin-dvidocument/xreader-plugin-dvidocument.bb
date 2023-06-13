SUMMARY = "DVI document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DVI documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-dvidocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "657230bc4c5b392c7b30d44c8d63bae99d6a1044b8a031c2c43694219d7e7efd2eeca02d08423d7784ac6fbec0927b84043a58c8ebb8fe11ef18fdf91fdfb3df"

RPROVIDES:${PN} += "libdvidocument.so()(64bit) \
xreader-plugin-dvidocument \
xreader-plugin-dvidocument(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libxreaderdocument.so.3()(64bit) \
xreader"

inherit rpm
