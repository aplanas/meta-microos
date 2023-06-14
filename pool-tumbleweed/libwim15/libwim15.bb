SUMMARY = "Library to extract, create, modify, and mount WIM files"
DESCRIPTION = "wimlib is a C library for creating, extracting, modifying, and mounting files in \
the Windows Imaging Format (WIM files)."
LICENSE = "CC0-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.13.6"

RPM_NAME = "libwim15-1.13.6-1.4.aarch64.rpm"
RPM_HASH = "861be1a89cdc255fd9c48ab8fa548d1692dedd3c1750964655873055be5e55d578a4066e45b021033699a664f6aafd801e26d2b0449adebff418f922a08d9faf"

RPROVIDES:${PN} += "libwim.so.15 \
libwim15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libntfs-3g.so.89 \
libxml2.so.2"

inherit rpm
