SUMMARY = "Universal TLS Tunnel"
DESCRIPTION = "Stunnel is a proxy designed to add TLS encryption functionality to existing clients and servers without \
any changes in the programs' code. Its architecture is optimized for security, portability, and \
scalability (including load-balancing), making it suitable for large deployments."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "stunnel-5.69-2.2.aarch64.rpm"
RPM_HASH = "f81a206bb8f968c84ce965dafb9e48d414388b719c91e0c5779ff65c3e3ca24113115217dafa32c6deb3c5beb741ed100f74333824dc03f86b63c09aca995c7a"

RPROVIDES:${PN} += "config-stunnel \
libstunnel.so \
stunnel"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/useradd \
fileutils \
fillup \
group-nogroup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libwrap.so.0 \
textutils"

inherit rpm
