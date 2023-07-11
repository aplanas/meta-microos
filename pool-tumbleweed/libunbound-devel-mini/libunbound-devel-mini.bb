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

RPM_NAME = "libunbound-devel-mini-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "55b83c0181a9f699d44fce8714848eafc9556f30b038ff61e8937002ddcdb517c5369358e20f866a507c45a0e14cfd601747a4e358623f55399900a6e43049fc"

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
