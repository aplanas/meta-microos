SUMMARY = "Lightweight SMTP Client"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.24"

RPM_NAME = "msmtp-1.8.24-1.1.aarch64.rpm"
RPM_HASH = "ce71ab1fc177cd0a3f7d804d5dd7e1b329c77a2719996b85b888e678095037aa51478358daf5e099e652f5a9b5ade730be07de0dcb9697e8d54603fa8062fc57"

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
