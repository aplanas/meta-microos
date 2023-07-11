SUMMARY = "Utilities for HMACs"
DESCRIPTION = "Use hmacsum to calculate a Hash-based Message Authentication Code (HMAC) of the data in a file."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac-tools-20230407-1.2.aarch64.rpm"
RPM_HASH = "147e2eee9af6ce17ed8c45c51933e7f92de5248e64fed2246b77a3d64bf4a8527c8cdc5211631f0e8d3f2f7a8b086a21fe2ebf032e79bc8c5b171c83b83f5b41"

RPROVIDES:${PN} += "libhmac-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libhmac.so.1"

inherit rpm
