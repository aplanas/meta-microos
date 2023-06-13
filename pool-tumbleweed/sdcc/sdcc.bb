SUMMARY = "Small Device C Compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "sdcc-4.2.0-1.3.aarch64.rpm"
RPM_HASH = "e9bdc5c14a50d77352a17ce939ec11bed0fe8cf108b91bb07e42bd884c507299d873c488dfcbe1c645bbc78c1c1e69b480ff3d1b7f3a46994a40336084e0f42d"

RPROVIDES:${PN} += "sdcc \
sdcc(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libncurses.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
