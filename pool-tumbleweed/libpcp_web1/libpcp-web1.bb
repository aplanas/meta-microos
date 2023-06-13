SUMMARY = "Performance Co-Pilot run-time web library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time web library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_web1-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "0e30b49330f3bfeca440ddbb4c064edb2f9568d7650ee943f5d5278f094ed8718939a2d4a6ec9e3e81373d88b3669c11aa1e68c1f52e36c416af7fc7f4050888"

RPROVIDES:${PN} += "libpcp_web.so.1()(64bit) \
libpcp_web1 \
libpcp_web1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libpcp.so.3()(64bit) \
libpcp_pmda.so.3()(64bit) \
libssl.so.3()(64bit) \
libuv.so.1()(64bit)"

inherit rpm
