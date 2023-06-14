SUMMARY = "Tools for converting the Zoner ZMF files"
DESCRIPTION = "Tools to work with the Zoner ZMF files, based on librevenge."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-tools-0.0.2-1.44.aarch64.rpm"
RPM_HASH = "68a786a4d981f7fbf7805dbdbbfd8f1348b3cdd42b52948b7145383e2b9f97b5e886984659ab65cbe72e0b080dde54e146fc03f2910af3116cbb90aef89d7752"

RPROVIDES:${PN} += "libzmf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libzmf-0.0.so.0"

inherit rpm
