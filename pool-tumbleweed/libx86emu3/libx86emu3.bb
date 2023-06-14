SUMMARY = "An x86 emulation library"
DESCRIPTION = "An x86 emulation library with focus on usage and \
execution logging functions."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "libx86emu3-3.5-1.8.aarch64.rpm"
RPM_HASH = "dde27e45d4efe83aea49ced6e352cce3738dd0e5e4873c591699d0ead82cc313917ded80daf36ee4e4808b54679e54bc2c7a7bf8778e0d040e255f2bdf705539"

RPROVIDES:${PN} += "libx86emu.so.3 \
libx86emu3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
