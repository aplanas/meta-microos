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

PV = "1.18.0"

RPM_NAME = "unbound-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "b95beeb7dde67cc743b9da2761cb44fff8ddb6eeda2e69b2d57460c85f281a7981b4316142eef920ca7c4730676bb32195d22ff01df65a57fff8c9753f375c00"

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
