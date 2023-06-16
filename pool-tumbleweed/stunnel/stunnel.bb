SUMMARY = "Universal TLS Tunnel"
DESCRIPTION = "Stunnel is a proxy designed to add TLS encryption functionality to existing clients and servers without \
any changes in the programs' code. Its architecture is optimized for security, portability, and \
scalability (including load-balancing), making it suitable for large deployments."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "stunnel-5.69-2.1.aarch64.rpm"
RPM_HASH = "9cc9574d21e5664369595765fe44b69b0984a6a460b7e3ca58614802991bc965ccc07a55727af6c6c8f2c434591bc70c1e51b439a293f3c5523606db805142de"

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
