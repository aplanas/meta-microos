SUMMARY = "Lightweight and featureful POP3 Client"
DESCRIPTION = "mpop is a small and fast POP3 client. Features include mail filtering, \
delivery to mbox files, maildir folders or a mail delivery agent, a \
very fast POP3 implementation, many authentication methods, good \
TLS/SSL support, IPv6 support, and more."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.18"

RPM_NAME = "mpop-1.4.18-1.4.aarch64.rpm"
RPM_HASH = "804fac4c4eff84858f941017037ab069ebefa5313dca61d76c4941d3fea4d0c743d03c08039af00af5d43b3969121d6a8c5b8e7429c39a1c9466d501edbfa871"

RPROVIDES:${PN} += "mpop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgsasl.so.7 \
libresolv.so.2 \
libsecret-1.so.0"

inherit rpm
