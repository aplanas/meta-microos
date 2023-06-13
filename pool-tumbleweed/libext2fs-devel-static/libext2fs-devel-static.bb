SUMMARY = "Development files for libext2fs"
DESCRIPTION = "Development files for libext2fs. Static libraries."
LICENSE = "LGPL-2.0-only"

PV = "1.47.0"

RPM_NAME = "libext2fs-devel-static-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "db6f85b17d1b769e43607bcc1cbe48778f100d31406ddc7430ab49e81dcb758368a8bd1bd1d4a12b921417c102c2272915d8e5fea1ee8a0b5eef564fc3f1273d"

RPROVIDES:${PN} += "libext2fs-devel-static \
libext2fs-devel-static(aarch-64) \
libext2fs-devel:/usr/lib64/libe2p.a \
libext2fs-devel:/usr/lib64/libext2fs.a"

RDEPENDS:${PN} += "libext2fs-devel"

inherit rpm
