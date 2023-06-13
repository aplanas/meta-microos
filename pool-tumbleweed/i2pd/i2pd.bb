SUMMARY = "C++ implementation of an I2P client"
DESCRIPTION = "The Invisible Internet Protocol (I2P) is a universal anonymous network layer. All \
communications over I2P are anonymous and end-to-end encrypted, participants \
don't reveal their real IP addresses. \
 \
This package contains a C++ implementation of an I2P router."
LICENSE = "BSD-3-Clause"

PV = "2.44.0"

RPM_NAME = "i2pd-2.44.0-1.6.aarch64.rpm"
RPM_HASH = "d2b82bc14b645ca8ca2636042cd994fe5fb5f1d0ceaa50b511298c9e6b6f1c386e67d7ab1d3970cf7bf0e8fb92ea336682b223194511b3682b583a3a836f1534"

RPROVIDES:${PN} += "config(i2pd) \
i2pd \
i2pd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libminiupnpc.so.17()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
shadow \
systemd"

inherit rpm
