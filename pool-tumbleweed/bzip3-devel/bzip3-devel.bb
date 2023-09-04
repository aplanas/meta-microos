SUMMARY = "Development files for libbzip3"
DESCRIPTION = "Development headers and library files for BZip3."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "bzip3-devel-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "ec4fab09c47d6f5d841242a54a7e0563ab77a2c2e857433d71be8890c6be526f95427faaf9dca23f8b2117cead7c40131968ea4e60a58d99213d5dcd6e1afc7b"

RPROVIDES:${PN} += "bzip3-devel \
pkgconfig-bzip3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbzip3-0"

inherit rpm
