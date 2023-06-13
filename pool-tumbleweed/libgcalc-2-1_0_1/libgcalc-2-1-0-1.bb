SUMMARY = "Shared library for gnome-calculator"
DESCRIPTION = "This package contains a shared library for gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "libgcalc-2-1_0_1-44.0-1.1.aarch64.rpm"
RPM_HASH = "3156f8d654dcbf050b8e2780f06a2d3fecf37b62c3f16e07351877d5ebac609ba6d38f3f7099a945f045bd089c404b6a6bfb07b91ca1c03023419557b3463213"

RPROVIDES:${PN} += "libgcalc-2-1_0_1 \
libgcalc-2-1_0_1(aarch-64) \
libgcalc-2.so.1.0.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit)"

inherit rpm
