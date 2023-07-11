SUMMARY = "Binary files of pmx"
DESCRIPTION = "Binary files of pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pmx-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "a8613db0b6b124f23974577565c1125066ed3a2c7da4a1f3027b0248b18b84196fd2f3b1e37ccc78a68266d16f74eecc411595dea909beb22dd5facebd5f0aa1"

RPROVIDES:${PN} += "texlive-pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-pmx"

inherit rpm
