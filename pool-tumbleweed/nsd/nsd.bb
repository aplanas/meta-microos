SUMMARY = "An authoritative-only domain name server"
DESCRIPTION = "NSD is a complete implementation of an authoritative domain name server, developed \
by NLnet Labs, with the purpose of creating more diversity in the DNS landscape."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "nsd-4.7.0-1.1.aarch64.rpm"
RPM_HASH = "18b02367ae63b659bf5defe9e0de74a7329d012706f8f3b3f8ba92f3303776fbe69fbf8f778ff3b7954112449bc692f7f8e9b369c04e12185d4cff594a64b36f"

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
shadow \
systemd"

inherit rpm
