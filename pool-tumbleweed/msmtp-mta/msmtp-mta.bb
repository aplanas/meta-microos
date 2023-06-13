SUMMARY = "MTA based on msmtp"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts. \
 \
This subpackage provides a mail transfer agent that can be used as \
a minimalistic replacement of sendmail and a minimal SMTP server."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.23"

RPM_NAME = "msmtp-mta-1.8.23-1.3.aarch64.rpm"
RPM_HASH = "e5ad1c58baa8f8ca5aa5e4c2d5a6903d59ebf8bf501ce8269b3c1b8b722752669d21117984c0d7364d31d2034e0d7c03fc753fc8e618e8f9afc2c96d92b9e017"

RPROVIDES:${PN} += "msmtp-mta \
msmtp-mta(aarch-64) \
smtp_daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsecret-1.so.0()(64bit) \
msmtp"

inherit rpm
