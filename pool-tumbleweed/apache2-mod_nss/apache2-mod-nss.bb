SUMMARY = "SSL/TLS module for the Apache HTTP server"
DESCRIPTION = "The mod_nss module provides strong cryptography for the Apache Web \
server via the Secure Sockets Layer (SSL) and Transport Layer \
Security (TLS) protocols using the Network Security Services (NSS) \
security library."
LICENSE = "Apache-2.0"

PV = "1.0.18"

RPM_NAME = "apache2-mod_nss-1.0.18-6.11.aarch64.rpm"
RPM_HASH = "dad001f7d6f5a43b6309b1941f08e0e5ea7bcdce83ca6d65cdf3b033c6675d05ca7ce44e637cfa4c2a6ea235596054ef72f64125232ea90df96a2665e77e2916"

RPROVIDES:${PN} += "apache2-mod-nss \
config-apache2-mod-nss \
libmodnss.so \
mod-nss"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
apache-mmn-20120211 \
apache2 \
findutils \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libplc4.so \
libssl3.so \
mozilla-nss \
mozilla-nss-tools \
suse-maintenance-mmn-0"

inherit rpm
