SUMMARY = "Tools for Mifare cards"
DESCRIPTION = "The libfreefare project aims to provide a convenient API for Mifare \
card manipulations. Supported tags include: Classic 1k/4k, DESFire \
2K/4K/8K, Ultralight/C. Supported features include: Mifare \
Application Directory (MAD) v1-v3. \
 \
This package contains example programs using libfreefare for \
inspecting and manipulating Mifare cards."
LICENSE = "LGPL-3.0+"

PV = "0.4.0"

RPM_NAME = "libfreefare-tools-0.4.0-4.31.aarch64.rpm"
RPM_HASH = "cdcb995177ea023d37691073f06dfde2f0edcbb4d18d1b24c168460522562857546407f14b84c1d4ccf7237cd2fbb77bd7e6ab76b9de07492b450541558a2cca"

RPROVIDES:${PN} += "libfreefare-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreefare.so.0 \
libnfc.so.6"

inherit rpm
