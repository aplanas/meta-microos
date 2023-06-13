SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-hppa64-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "1b79fe927634fda420771b37750955b28150be56569eb13ae666b85251b36870db6cbabb849e23feddd1f4213be3da23b8e0b3b0a57d89814afa155a7138fa87"

RPROVIDES:${PN} += "cross-hppa64-binutils \
cross-hppa64-binutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
