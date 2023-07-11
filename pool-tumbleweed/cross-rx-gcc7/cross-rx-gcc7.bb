SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-rx-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "4f4cc77c2f403cdc7bda6bfa2f2d1ffb59453f3fd2e4ed67093efbf3604b6fc59654b403e96c4333cd54d215488c1a372b936912d82273c6c9fb2d645c5cb64f"

RPROVIDES:${PN} += "cross-rx-gcc7 \
liblto-plugin.so.0 \
rx-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-rx-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
