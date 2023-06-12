SUMMARY = "The OpenSLP Implementation of the Service Location Protocol V2"
DESCRIPTION = "Service Location Protocol is an IETF standards track protocol that \
provides a framework that allows networking applications to discover \
the existence, location, and configuration of networked services in \
networks. \
 \
This package contains the SLP server. Every system, which provides any \
services that should be used via an SLP client must run this server and \
register the service."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "openslp-server-2.0.0-21.4.aarch64.rpm"
RPM_HASH = "7ead95961c8e8f6f3479019127d92e9d0851224cd2dfc6d4931769a1894d5dbf759162fb2b308d6d296ad856db4de88d7ac53e99ad09a44bb8d864ae2d30bb97"

RPROVIDES:${PN} += "config(openslp-server) \
openslp-server \
openslp-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
group(daemon) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
openslp \
shadow \
systemd"

inherit rpm