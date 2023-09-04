SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to work with various xml streams."
LICENSE = "MPL-2.0"

PV = "0.18.1"

RPM_NAME = "liborcus-tools-0.18.1-3.1.aarch64.rpm"
RPM_HASH = "a9e9171fe0efaf38ac244da02e6a0c24205e19885ecb9fe68e83b7ecc6a87033001e6484dda1f0e8b5a26ea990c40166ab045669bd926539df56aaa751c76f9a"

RPROVIDES:${PN} += "liborcus-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
liborcus-0-18-0 \
liborcus-0.18.so.0 \
liborcus-mso-0.18.so.0 \
liborcus-parser-0.18.so.0 \
liborcus-spreadsheet-model-0.18.so.0 \
libstdc++.so.6"

inherit rpm
