SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to work with various xml streams."
LICENSE = "MPL-2.0"

PV = "0.17.2"

RPM_NAME = "liborcus-tools-0.17.2-3.4.aarch64.rpm"
RPM_HASH = "545685dead742f3b58ebe35e6a3590d92429bf8e4d9a1bf5546fa1e4bfcd108d9043e2fcee0a500b671b07bbce167b8900b94c407adb4484a2b36b39d0fa79d1"

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
