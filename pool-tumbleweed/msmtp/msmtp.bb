SUMMARY = "Lightweight SMTP Client"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.23"

RPM_NAME = "msmtp-1.8.23-1.3.aarch64.rpm"
RPM_HASH = "d183db8f5311efb766c33fd1456fd3b469e1a97d6f1c22c21cdc22eb1877d2464843bc66b0fc58e2608ab8d0bc619a9591848fc6d4f784925dfb0879720f866f"

RPROVIDES:${PN} += "msmtp"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgsasl.so.7 \
libresolv.so.2 \
libsecret-1.so.0"

inherit rpm
