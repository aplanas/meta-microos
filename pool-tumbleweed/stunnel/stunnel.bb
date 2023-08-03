SUMMARY = "Universal TLS Tunnel"
DESCRIPTION = "Stunnel is a proxy designed to add TLS encryption functionality to existing clients and servers without \
any changes in the programs' code. Its architecture is optimized for security, portability, and \
scalability (including load-balancing), making it suitable for large deployments."
LICENSE = "GPL-2.0-or-later"

PV = "5.70"

RPM_NAME = "stunnel-5.70-1.1.aarch64.rpm"
RPM_HASH = "c684fb30e4d0bbd5906358aacb59e6836720c7f01b5dc7787c1b40fb9cf82c2f04f311660ed3f0efbe919b085bcd69e76f29e40dae0f8834799882dda314d09f"

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
