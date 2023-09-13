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

PV = "1.18.0"

RPM_NAME = "libunbound-devel-mini-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "e3be25f9ac8101d752a63a6d1d3a0f047e2e34988b0286fa50b425eb73bb6e57a755cff695fbd2ea2cb151ccb58b4014e4c77bd984e19ca2971f269512b550e7"

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
