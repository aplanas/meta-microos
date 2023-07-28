SUMMARY = "Mellanox Firmware Burning and Diagnostics Tools"
DESCRIPTION = "This package contains a burning tool and diagnostic tools for Mellanox \
manufactured HCA/NIC cards. It also provides access to the relevant \
source code. Please see the file LICENSE for licensing details. \
 \
This package is based on a subset of the Mellanox Firmware Tools (MFT) \
package. For a full documentation of the MFT package, please refer to \
the downloads page at the Mellanox web site."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "4.24.0"

RPM_NAME = "mstflint-4.24.0-1.1.aarch64.rpm"
RPM_HASH = "66c0099d455ff5af229a52a14ae21b7ab20a01096bfd392bcfa832a40390449f4c9870495e653b72472c92f8a1ed5fc37c09490ce4c518de7d243cb2b1a97c58"

RPROVIDES:${PN} += "mstflint"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
