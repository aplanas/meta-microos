SUMMARY = "A gnu make version including a debuger"
DESCRIPTION = "remake is a patched and modernized version of GNU make utility that \
adds improved error reporting, the ability to trace execution in a \
comprehensible way, and a debugger."
LICENSE = "GPL-3.0-or-later"

PV = "4.3_1.5"

RPM_NAME = "remake-4.3_1.5-1.10.aarch64.rpm"
RPM_HASH = "ddcfc361a63c663a89972fe24b2b41f2f497939e7a39bd959d7481c4ca8ee661e80deaa87531872b10ffa5045d4480c33f83b21fc93614945ec211c9666cc090"

RPROVIDES:${PN} += "remake \
remake(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
