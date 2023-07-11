SUMMARY = "Development files for the Yubikey NEO PIV applet library"
DESCRIPTION = "This package contains the header file needed to develop applications that use \
Yubikey NEO PIV applet library."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykpiv-devel-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "2b6b93fb627ea0c04f1ac89e78595419b02ab754ae9ad7142f0e447a2aed69f0c92f59d56a479bd67da7db40b22dde96c85fe2004f417d47230d948e7bd3d0c2"

RPROVIDES:${PN} += "libykpiv-devel \
pkgconfig-ykpiv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libykpiv2 \
pkgconfig-libcrypto"

inherit rpm
