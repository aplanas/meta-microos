SUMMARY = "Lightweight and featureful POP3 Client"
DESCRIPTION = "mpop is a small and fast POP3 client. Features include mail filtering, \
delivery to mbox files, maildir folders or a mail delivery agent, a \
very fast POP3 implementation, many authentication methods, good \
TLS/SSL support, IPv6 support, and more."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.18"

RPM_NAME = "mpop-1.4.18-1.3.aarch64.rpm"
RPM_HASH = "b1a0556f41bea26d9a45c6c00788bdbb91bf453fa7c5342b5069cf4e3c2af6e75fe0984a2c511233b1c5e55116670ddaad9445c96c546718cae4b7c4e071d636"

RPROVIDES:${PN} += "mpop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgsasl.so.7 \
libresolv.so.2 \
libsecret-1.so.0"

inherit rpm
