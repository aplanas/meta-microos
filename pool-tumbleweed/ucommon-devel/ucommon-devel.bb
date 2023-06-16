SUMMARY = "Headers for building ucommon applications"
DESCRIPTION = "This package provides header and support files needed for building \
applications that use the uCommon library and frameworks."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.1"

RPM_NAME = "ucommon-devel-7.0.1-1.9.aarch64.rpm"
RPM_HASH = "74f3900418c4cd6665ecd4fae4ed61074c80db544c9c036f3aa3dbd6d69b5cb160824e6e8be1d587b5fca0454846de6165d6ecd5e519f174f5b1cfdb7f0a878f"

RPROVIDES:${PN} += "pkgconfig-commoncpp \
pkgconfig-ucommon \
ucommon-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libucommon8 \
pkgconfig-libcrypto \
pkgconfig-libssl"

inherit rpm
