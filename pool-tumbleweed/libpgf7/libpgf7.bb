SUMMARY = "Progressive Graphics File Library"
DESCRIPTION = "libpgf is a library for working with PGF (Progresive Graphics File) images."
LICENSE = "LGPL-2.1-or-later"

PV = "7.21.7"

RPM_NAME = "libpgf7-7.21.7-1.10.aarch64.rpm"
RPM_HASH = "e9499d633100a0ed6761cc27f9d73833d0477cea4ba1d0df26696e7f5cb146937db9047ec8fd35bc4effe9310c62390af65de71294ee05e6ac16044da5d07893"

RPROVIDES:${PN} += "libpgf.so.7 \
libpgf7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
