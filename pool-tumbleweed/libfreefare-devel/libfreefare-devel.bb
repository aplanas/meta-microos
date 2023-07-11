SUMMARY = "Development files for the Mifare card manipulation library"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3. \
 \
This package contains the libfreefare development files."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare-devel-0.4.0-4.32.aarch64.rpm"
RPM_HASH = "84d191b7d9acfc96f777a6b9152444eca4e979baf3783b1516694533551f39ce43288c728fb2c44fa5b5f5db00f5cce319de9b92763bc96d22ba1e0901e9dbbb"

RPROVIDES:${PN} += "libfreefare-devel \
pkgconfig-libfreefare"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreefare0 \
pkgconfig-libnfc"

inherit rpm
