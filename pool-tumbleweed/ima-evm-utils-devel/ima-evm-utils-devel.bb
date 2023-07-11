SUMMARY = "Development files for the IMA/EVM control utility library"
DESCRIPTION = "This package contains the header files and the utilities for ima-evm-utils."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "ima-evm-utils-devel-1.5-1.3.aarch64.rpm"
RPM_HASH = "174d2d49c19fd4816086932491a09a2db9a6364668e802db27eab5763bfe4b3115a8b585a263e3b7905e3d00978fe44be3731c0f029db8fcf1c89b0c09a774b8"

RPROVIDES:${PN} += "ima-evm-utils-devel"

RDEPENDS:${PN} += "libimaevm4 \
openssl-devel"

inherit rpm
