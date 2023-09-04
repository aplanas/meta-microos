SUMMARY = "Development files for libboinc"
DESCRIPTION = "This package contains development files for libboinc."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.24.1"

RPM_NAME = "boinc-client-devel-7.24.1-1.1.aarch64.rpm"
RPM_HASH = "e6e39fadb1eb0e588ae6510fa2243a4892ed521e44c99479d8b703d46b1ecc5e6d22a1fe1516664af0cc91f5565a67bcc47a0fe7f1116a8222b3613c6a9d2cc2"

RPROVIDES:${PN} += "boinc-client-devel \
libboinc-devel \
pkgconfig-libboinc \
pkgconfig-libboinc-api \
pkgconfig-libboinc-crypt \
pkgconfig-libboinc-graphics2 \
pkgconfig-libboinc-opencl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboinc7 \
openssl-devel \
pkgconfig-libjpeg \
pkgconfig-openssl"

inherit rpm
