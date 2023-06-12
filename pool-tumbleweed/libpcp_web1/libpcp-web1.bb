SUMMARY = "Performance Co-Pilot run-time web library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time web library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_web1-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "0e30b49330f3bfeca440ddbb4c064edb2f9568d7650ee943f5d5278f094ed8718939a2d4a6ec9e3e81373d88b3669c11aa1e68c1f52e36c416af7fc7f4050888"

RPROVIDES:${PN} += "libpcp_web.so.1()(64bit) \
libpcp_web.so.1(PCP_WEB_1.0)(64bit) \
libpcp_web.so.1(PCP_WEB_1.1)(64bit) \
libpcp_web.so.1(PCP_WEB_1.10)(64bit) \
libpcp_web.so.1(PCP_WEB_1.11)(64bit) \
libpcp_web.so.1(PCP_WEB_1.12)(64bit) \
libpcp_web.so.1(PCP_WEB_1.13)(64bit) \
libpcp_web.so.1(PCP_WEB_1.14)(64bit) \
libpcp_web.so.1(PCP_WEB_1.15)(64bit) \
libpcp_web.so.1(PCP_WEB_1.2)(64bit) \
libpcp_web.so.1(PCP_WEB_1.3)(64bit) \
libpcp_web.so.1(PCP_WEB_1.4)(64bit) \
libpcp_web.so.1(PCP_WEB_1.5)(64bit) \
libpcp_web.so.1(PCP_WEB_1.6)(64bit) \
libpcp_web.so.1(PCP_WEB_1.7)(64bit) \
libpcp_web.so.1(PCP_WEB_1.8)(64bit) \
libpcp_web.so.1(PCP_WEB_1.9)(64bit) \
libpcp_web1 \
libpcp_web1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.10)(64bit) \
libpcp.so.3(PCP_3.11)(64bit) \
libpcp.so.3(PCP_3.13)(64bit) \
libpcp.so.3(PCP_3.16)(64bit) \
libpcp.so.3(PCP_3.2)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp.so.3(PCP_3.26)(64bit) \
libpcp.so.3(PCP_3.27)(64bit) \
libpcp.so.3(PCP_3.28)(64bit) \
libpcp.so.3(PCP_3.29)(64bit) \
libpcp.so.3(PCP_3.4)(64bit) \
libpcp.so.3(PCP_3.7)(64bit) \
libpcp.so.3(PCP_3.9)(64bit) \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libuv.so.1()(64bit)"

inherit rpm
