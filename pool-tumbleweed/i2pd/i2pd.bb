SUMMARY = "C++ implementation of an I2P client"
DESCRIPTION = "The Invisible Internet Protocol (I2P) is a universal anonymous network layer. All \
communications over I2P are anonymous and end-to-end encrypted, participants \
don't reveal their real IP addresses. \
 \
This package contains a C++ implementation of an I2P router."
LICENSE = "BSD-3-Clause"

PV = "2.48.0"

RPM_NAME = "i2pd-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "70e681ec059225e558ed31331fa8adedd24317ccff745bbc7c821443fde7afa2aee18f05063453dfcffe4ff05508e9a9768d0e681a16469ec6791224699cf689"

RPROVIDES:${PN} += "config-i2pd \
i2pd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libminiupnpc.so.17 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
shadow \
systemd"

inherit rpm
