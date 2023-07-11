SUMMARY = "Validating, recursive, and caching DNS(SEC) resolver"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
The C implementation of Unbound is developed and maintained by NLnet \
Labs. It is based on ideas and algorithms taken from a java prototype \
developed by Verisign labs, Nominet, Kirei and ep.net. \
 \
Unbound is designed as a set of modular components, so that also \
DNSSEC (secure DNS) validation and stub-resolvers (that do not run \
as a server, but are linked into an application) are easily possible."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "c944f0c00f3667f90a8f4f60ba2a85610a6fb9fb9b81c0437755840d6a3c6299c24a180d4605a3ec5e3533f15463cd6f3326ed97cfe3a76504c60b98d338f9b6"

RPROVIDES:${PN} += "config-unbound \
unbound"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
ldns \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libnghttp2.so.14 \
libprotobuf-c.so.1 \
libpython3.11.so.1.0 \
libsodium.so.23 \
libssl.so.3 \
libunbound.so.8 \
openssl \
sudo \
systemd"

inherit rpm
