SUMMARY = "SSL/TLS module for the Apache HTTP server"
DESCRIPTION = "The mod_nss module provides strong cryptography for the Apache Web \
server via the Secure Sockets Layer (SSL) and Transport Layer \
Security (TLS) protocols using the Network Security Services (NSS) \
security library."
LICENSE = "Apache-2.0"

PV = "1.0.18"

RPM_NAME = "apache2-mod_nss-1.0.18-6.13.aarch64.rpm"
RPM_HASH = "39726fc627c83e4996aa7a47dd0b88909e3f875a5845a5ed5df2d59b2bc81b430c33625df45dde2fb41d90bbeabefd183a8fef2610ceb4787f4c557316f2ddee"

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
