SUMMARY = "Development tools for Video Multi-Method Assessment Fusion"
DESCRIPTION = "VMAF is a perceptual video quality assessment algorithm developed by \
Netflix. \
This package contains the library API definitions."
LICENSE = "BSD-2-Clause-Patent & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "vmaf-devel-2.3.1-3.3.aarch64.rpm"
RPM_HASH = "a3fba99339789aadf5dd79f755bf4bdd1efcdeb00c6c9c28fe0b41dc5a98332bf62462e09d4f943ddb047961c41dc5f69c66d7b4ec67cd6ab580c08bec409e09"

RPROVIDES:${PN} += "pkgconfig-libvmaf \
vmaf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvmaf1"

inherit rpm
