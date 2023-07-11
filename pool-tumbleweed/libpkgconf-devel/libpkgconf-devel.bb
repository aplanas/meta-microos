SUMMARY = "Development files for libpkgconf"
DESCRIPTION = "This package provides files necessary for developing applications \
to use functionality provided by pkgconf."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "libpkgconf-devel-1.8.0-2.5.aarch64.rpm"
RPM_HASH = "802286adef20855be9fbb779038ec151c3a2f66af58a5d32cb460c654ac1df52a070ace8fcabe0f66802b4ddb232100a3ee29c239584896cdb5368f0a1cd9a73"

RPROVIDES:${PN} += "libpkgconf-devel \
pkgconfig-libpkgconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpkgconf3"

inherit rpm
