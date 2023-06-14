SUMMARY = "Development files for libpkgconf"
DESCRIPTION = "This package provides files necessary for developing applications \
to use functionality provided by pkgconf."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "libpkgconf-devel-1.8.0-2.3.aarch64.rpm"
RPM_HASH = "1832bd51aa0f4a72b4ca69e0972479308c95bcfc5f7d96bfe29b7d1e2b5238df624077a2c2c11b1b16a63c2af6012e1dcaff4a6cc293ee7bf0cdc279f749ab2d"

RPROVIDES:${PN} += "libpkgconf-devel \
pkgconfig-libpkgconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpkgconf3"

inherit rpm
