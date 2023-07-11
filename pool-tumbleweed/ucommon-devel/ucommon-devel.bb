SUMMARY = "Headers for building ucommon applications"
DESCRIPTION = "This package provides header and support files needed for building \
applications that use the uCommon library and frameworks."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.1"

RPM_NAME = "ucommon-devel-7.0.1-1.10.aarch64.rpm"
RPM_HASH = "0b9ea81aba9290eab49af6f85780d2a67f6da68a62b27db3460edacea8a7eb5ad73352c6d74edca98904bd8aeecba097b08b80b2bed22cce697d4edbd7ac41fe"

RPROVIDES:${PN} += "pkgconfig-commoncpp \
pkgconfig-ucommon \
ucommon-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libucommon8 \
pkgconfig-libcrypto \
pkgconfig-libssl"

inherit rpm
