SUMMARY = "Performance Co-Pilot run-time web library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time web library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_web1-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "0e30b49330f3bfeca440ddbb4c064edb2f9568d7650ee943f5d5278f094ed8718939a2d4a6ec9e3e81373d88b3669c11aa1e68c1f52e36c416af7fc7f4050888"

RPROVIDES:${PN} += "libpcp-web.so.1 \
libpcp-web1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libssl.so.3 \
libuv.so.1"

inherit rpm
