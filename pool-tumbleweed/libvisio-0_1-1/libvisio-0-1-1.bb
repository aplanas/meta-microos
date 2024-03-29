SUMMARY = "Library for parsing the MS Visio file format structure"
DESCRIPTION = "libvisio is a library for parsing the MS Visio file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-0_1-1-0.1.7-1.27.aarch64.rpm"
RPM_HASH = "922674b2b1488a1e040f38bed0c2a914bfa1ba1be5ee9e4823c8b0e52f0711bdbb32341b075f4ccc95097b67ec7ec2e595e6214ca091dd1f15c7998c78badd33"

RPROVIDES:${PN} += "libvisio-0-1-1 \
libvisio-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
