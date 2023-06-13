SUMMARY = "A tool to force swapped out pages back into memory"
DESCRIPTION = "Pagein is a tool that forces pages that are in swap to be paged in back \
to memory. The main usecase for pagein is to exercise the VM and swap \
subsystems for testing purposes."
LICENSE = "GPL-2.0-only"

PV = "0.01.09"

RPM_NAME = "pagein-0.01.09-1.2.aarch64.rpm"
RPM_HASH = "b91360d7a3eeee3c948792f72d86f11d9d98dcf5d5d82b85fea94256bceb833e31ce39fd24cf98fe69c801c64fbfcf3f224b080145790e34d2c6b1495213d1f7"

RPROVIDES:${PN} += "pagein \
pagein(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
