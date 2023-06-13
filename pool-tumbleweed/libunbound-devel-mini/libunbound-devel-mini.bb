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

RPM_NAME = "libunbound-devel-mini-1.17.1-1.3.aarch64.rpm"
RPM_HASH = "06ab15cc10eba7578215a5b1156481014d4999f47681906bfd7989661dcb50bed602d6ce4a6198a8ebe1f9eeaad8913340b52e072502daa7f20a549e051f815a"

RPROVIDES:${PN} += "libunbound-devel \
libunbound-devel-mini \
libunbound-devel-mini(aarch-64) \
libunbound.so.8()(64bit) \
pkgconfig(libunbound)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libevent-2.1.so.7()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.3()(64bit) \
pkgconfig(libevent) \
this-is-only-for-build-envs"

inherit rpm
