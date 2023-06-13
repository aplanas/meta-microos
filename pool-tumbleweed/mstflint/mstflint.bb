SUMMARY = "Mellanox Firmware Burning and Diagnostics Tools"
DESCRIPTION = "This package contains a burning tool and diagnostic tools for Mellanox \
manufactured HCA/NIC cards. It also provides access to the relevant \
source code. Please see the file LICENSE for licensing details. \
 \
This package is based on a subset of the Mellanox Firmware Tools (MFT) \
package. For a full documentation of the MFT package, please refer to \
the downloads page at the Mellanox web site."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "4.21.0"

RPM_NAME = "mstflint-4.21.0-2.4.aarch64.rpm"
RPM_HASH = "8d930d3470dacd5a9baed6c5ab9e59394e37c3ee2dd6ccd8a8f47b6592b991855736a69bb7761515ca91030f4ea4a65fb37b405dc46771d010057aea5b049231"

RPROVIDES:${PN} += "mstflint \
mstflint(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
