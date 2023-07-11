SUMMARY = "Development headers and libraries for libmysofa"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard. \
 \
This package contains the development libraries and headers for libmysofa."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libmysofa-devel-1.3.1-2.1.aarch64.rpm"
RPM_HASH = "79141ffb4d749a11c6a75c09dd0aad010822f2b7c1180959cd6c77fc0d02943ee1143b7414b1cadd7b9e20e22f8dd8bd989e6ade43e1a5b860771c4b662950c4"

RPROVIDES:${PN} += "libmysofa-devel \
pkgconfig-libmysofa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmysofa1"

inherit rpm
