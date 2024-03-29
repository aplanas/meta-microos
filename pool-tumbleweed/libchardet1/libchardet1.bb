SUMMARY = "Mozilla Universal Chardet library"
DESCRIPTION = "Mozilla's Universal Charset Detector C/C++ API."
LICENSE = "MPL-1.1"

PV = "1.0.6"

RPM_NAME = "libchardet1-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "225d2472332dd615a1e90cf6e0f8d030e7403e742fef2a64ce3d0331e5229f48291aad0bfece8d3a89111c0ee96d5bf42a25ec1f6dfc0455a085b1e815fc4337"

RPROVIDES:${PN} += "libchardet.so.1 \
libchardet1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
libc.so.6 \
libstdc++.so.6"

inherit rpm
