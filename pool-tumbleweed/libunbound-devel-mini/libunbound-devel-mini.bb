SUMMARY = "Just a devel package for build loops"
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

RPM_NAME = "libunbound-devel-mini-1.17.1-2.1.aarch64.rpm"
RPM_HASH = "53413c3dd17ed0ac1a259180a36d56d7920184ec6ce7eda83e8ae01a2a190cb5fe6bf6768ea3e5763f85350cbcb2cd243c7d2a4699b84362ff18e13e4d6e79aa"

RPROVIDES:${PN} += "libunbound-devel \
libunbound-devel-mini \
libunbound.so.8 \
pkgconfig-libunbound"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libsodium.so.23 \
libssl.so.3 \
pkgconfig-libevent \
this-is-only-for-build-envs"

inherit rpm
