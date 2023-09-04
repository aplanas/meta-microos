SUMMARY = "An authoritative-only domain name server"
DESCRIPTION = "NSD is a complete implementation of an authoritative domain name server, developed \
by NLnet Labs, with the purpose of creating more diversity in the DNS landscape."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "nsd-4.7.0-2.1.aarch64.rpm"
RPM_HASH = "df26a88c1bcb91c54a74df59364a854477fd322169a4432b7e4db9991bda796aed8aa2eb99e05938d9a76f37e24878926d7a319594fed778e3693db0ed0e53bd"

RPROVIDES:${PN} += "config-nsd \
nsd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
findutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libssl.so.3 \
shadow"

inherit rpm
