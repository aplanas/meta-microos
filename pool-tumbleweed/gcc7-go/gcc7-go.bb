SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-go-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "3b11a590b9087a67e898b0ea4e52aa80f257236730a3e6cd68d2ec70392432d6136f702ec05e8ff1488011b0bedb8ea6e21bb8a5bde14ec007ab67cb8c44d151"

RPROVIDES:${PN} += "gcc7-go \
gcc7-go(aarch-64)"

RDEPENDS:${PN} += "gcc7 \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libgo.so.11()(64bit) \
libgo11 \
libisl.so.23()(64bit) \
libm.so.6()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
