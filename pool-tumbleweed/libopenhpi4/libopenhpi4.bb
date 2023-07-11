SUMMARY = "OpenHPI base libraries"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). \
 \
This subpackage contains the OpenHPI base libraries."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "libopenhpi4-3.8.0.ge4631e8a-3.5.aarch64.rpm"
RPM_HASH = "3d3b0f8ce89e89d1c200d31eedfbe9e11a40372630e0505ae6b39a875e2d3a3ff5c36cd897940f65c3790cce424c4d9c9523cbfbf52d3b24c12c8dc6936a0b03"

RPROVIDES:${PN} += "libopenhpi-ssl.so.4 \
libopenhpi.so.4 \
libopenhpi4 \
libopenhpimarshal.so.4 \
libopenhpitransport.so.4 \
libopenhpiutils.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
