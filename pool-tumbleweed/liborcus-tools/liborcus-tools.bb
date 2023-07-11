SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to work with various xml streams."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-tools-0.17.2-3.5.aarch64.rpm"
RPM_HASH = "88d5e0ce4159e20d05190b8026d84df45a96089a4ddae33196b4af9e590e98fa1d8890cfb9633fda5ba5ef30d264d9530d1299c8ec82c655015d7fe5898136a1"

RPROVIDES:${PN} += "liborcus-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
liborcus-0-17-0 \
liborcus-0.17.so.0 \
liborcus-mso-0.17.so.0 \
liborcus-parser-0.17.so.0 \
liborcus-spreadsheet-model-0.17.so.0 \
libstdc++.so.6"

inherit rpm
