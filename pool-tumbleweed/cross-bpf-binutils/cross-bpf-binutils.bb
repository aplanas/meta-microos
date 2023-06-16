SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-bpf-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "734c9d012f07d1b2b5b845e1a567043d7083da19732a1435392e0cf15babf069bcf771485810d8846b6883a4da28b53de90ca3c4663a516430ed4860b9034595"

RPROVIDES:${PN} += "cross-bpf-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
