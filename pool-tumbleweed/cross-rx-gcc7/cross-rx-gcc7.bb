SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-rx-gcc7-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "50b7aa59ba32ffe04d434313ee5ac38af048ed6c17e7c86accdf480773416986e6807577017c8dee56c199c190f7fac6126c4b864b2c600c2353c03402acd663"

RPROVIDES:${PN} += "cross-rx-gcc7 \
cross-rx-gcc7(aarch-64) \
liblto_plugin.so.0()(64bit) \
rx-elf-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-rx-binutils \
libc.so.6(GLIBC_2.36)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm
