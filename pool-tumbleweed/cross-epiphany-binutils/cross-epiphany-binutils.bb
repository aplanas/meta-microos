SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-epiphany-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "4d24c58640dbc1d90f2e4254da600ca8e880ef672ccefd5be4fa3ac8e6ce44dbad6365b58004bf1698fd28113f0bf83ad80820c0f25bbe4c81cf070143eba845"

RPROVIDES:${PN} += "cross-epiphany-binutils \
cross-epiphany-binutils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
update-alternatives"

inherit rpm
