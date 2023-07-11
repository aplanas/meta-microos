SUMMARY = "Development libraries and headers for lzham_codec"
DESCRIPTION = "This package contains development libraries and headers for lzham_codec."
LICENSE = "MIT"

PV = "1_0_stable1"

RPM_NAME = "lzham_codec-devel-1_0_stable1-2.20.aarch64.rpm"
RPM_HASH = "59009c737653d5533b1223508f123fa5a6a9abf7007f6b289201dd16d703b3d2db9a63f0b603821a772c63cf8a531e8aa1df41f02ff864260bbd0345c1df9d7f"

RPROVIDES:${PN} += "lzham-codec-devel \
pkgconfig-lzham-codec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lzham-codec-libs"

inherit rpm
