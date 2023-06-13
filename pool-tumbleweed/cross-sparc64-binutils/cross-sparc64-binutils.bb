SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-sparc64-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "d2e1804f49f3964d40e050e5a3f6bf64df259e9e39f3fcd2db30cf0064faa8566f663aefac8bfe573bfbaa697cc0c8ee97e58444452e1fb9e5ed1c2e9fdc6338"

RPROVIDES:${PN} += "cross-sparc64-binutils \
cross-sparc64-binutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
