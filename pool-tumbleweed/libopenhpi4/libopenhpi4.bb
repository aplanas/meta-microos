SUMMARY = "OpenHPI base libraries"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). \
 \
This subpackage contains the OpenHPI base libraries."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "libopenhpi4-3.8.0.ge4631e8a-3.4.aarch64.rpm"
RPM_HASH = "46247807b4bb5d63bf20266e6300200ed17d47e6cf2dbff3cbc469401d121ddc753de1712f0fe5fdfac0b5da94d150995606b005a7b88f45026b7226e59fa163"

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
