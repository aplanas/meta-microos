SUMMARY = "Universal TLS Tunnel"
DESCRIPTION = "Stunnel is a proxy designed to add TLS encryption functionality to existing clients and servers without \
any changes in the programs' code. Its architecture is optimized for security, portability, and \
scalability (including load-balancing), making it suitable for large deployments."
LICENSE = "GPL-2.0-or-later"

PV = "5.70"

RPM_NAME = "stunnel-5.70-2.1.aarch64.rpm"
RPM_HASH = "a7662de8611d0d9fb373d15f6d8075c8a6792e3508a537f7e92cb023e396d548a811d70309c5142c50373e82de5799a4e5b71705184cd3fe1f31893f55ef020c"

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
