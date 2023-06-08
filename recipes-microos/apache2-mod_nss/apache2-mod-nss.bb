SUMMARY = "SSL/TLS module for the Apache HTTP server"
DESCRIPTION = "The mod_nss module provides strong cryptography for the Apache Web \
server via the Secure Sockets Layer (SSL) and Transport Layer \
Security (TLS) protocols using the Network Security Services (NSS) \
security library."
LICENSE = "Apache-2.0"

PV = "1.0.18"

RPM_NAME = "apache2-mod_nss-1.0.18-6.11.aarch64.rpm"
RPM_HASH = "dad001f7d6f5a43b6309b1941f08e0e5ea7bcdce83ca6d65cdf3b033c6675d05ca7ce44e637cfa4c2a6ea235596054ef72f64125232ea90df96a2665e77e2916"

RPROVIDES:${PN} += "apache2-mod_nss apache2-mod_nss(aarch-64) config(apache2-mod_nss) libmodnss.so()(64bit) mod_nss"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl apache2 apache_mmn_20120211 findutils iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10)(64bit) libnss3.so(NSS_3.10.2)(64bit) libnss3.so(NSS_3.11.7)(64bit) libnss3.so(NSS_3.12)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.5)(64bit) libnss3.so(NSS_3.6)(64bit) libnss3.so(NSS_3.9)(64bit) libnss3.so(NSS_3.9.2)(64bit) libplc4.so()(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.12.6)(64bit) libssl3.so(NSS_3.14)(64bit) libssl3.so(NSS_3.2)(64bit) libssl3.so(NSS_3.4)(64bit) libssl3.so(NSS_3.7.4)(64bit) mozilla-nss mozilla-nss-tools suse_maintenance_mmn_0"

inherit rpm
