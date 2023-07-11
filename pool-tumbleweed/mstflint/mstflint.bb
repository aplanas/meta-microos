SUMMARY = "Mellanox Firmware Burning and Diagnostics Tools"
DESCRIPTION = "This package contains a burning tool and diagnostic tools for Mellanox \
manufactured HCA/NIC cards. It also provides access to the relevant \
source code. Please see the file LICENSE for licensing details. \
 \
This package is based on a subset of the Mellanox Firmware Tools (MFT) \
package. For a full documentation of the MFT package, please refer to \
the downloads page at the Mellanox web site."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "4.23.0"

RPM_NAME = "mstflint-4.23.0-1.1.aarch64.rpm"
RPM_HASH = "b9332cf6b7df18d602de6141db0ecc6a4f5cf16f05a86d1e5f5a6bb5b1bf17ef472b88ddd5fc41bf57d796d990742bf86c0407f5dfb6b005b9f63e93b5b4da5a"

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
