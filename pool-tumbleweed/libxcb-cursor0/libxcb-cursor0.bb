SUMMARY = "XCB cursor library (libxcursor port)"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- cursor: port of libxcursor"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "libxcb-cursor0-0.1.4-1.4.aarch64.rpm"
RPM_HASH = "aa4f05b80e05dc1a9ac77c7f668140a73d19a8a45f894a29055edcfb67113c90255ee8035951867b32959c1b5685ca8bd4d3b3d760fda3d54b892439ece7530c"

RPROVIDES:${PN} += "libxcb-cursor.so.0 \
libxcb-cursor0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-image.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb.so.1"

inherit rpm
