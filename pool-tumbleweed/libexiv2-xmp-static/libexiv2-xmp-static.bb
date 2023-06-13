SUMMARY = "Library required too link libexiv2"
DESCRIPTION = "libexiv2-xmp is a static library required to link with libexiv2."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.27.6"

RPM_NAME = "libexiv2-xmp-static-0.27.6-3.3.aarch64.rpm"
RPM_HASH = "6ca4195c3966ea154b27774fdbee07d6ffdda0f8e7b5453347d687e941e25d10a0b44726f4914bfbb853fcbbb4c7ad0a2ccc4bc2d6e37585d3d250277a7ab182"

RPROVIDES:${PN} += "libexiv2-xmp-static \
libexiv2-xmp-static(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
