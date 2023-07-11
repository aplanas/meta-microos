SUMMARY = "MTA based on msmtp"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts. \
 \
This subpackage provides a mail transfer agent that can be used as \
a minimalistic replacement of sendmail and a minimal SMTP server."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.24"

RPM_NAME = "msmtp-mta-1.8.24-1.1.aarch64.rpm"
RPM_HASH = "691d5b1fdfa7fc6b31dd995ecb735be5a230fc723c208b1571a16d80621c7325f756e882433ad367ff5a46d006fbb9e51539f39b21c77dffbfae8c5671c81135"

RPROVIDES:${PN} += "msmtp-mta \
smtp-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsecret-1.so.0 \
msmtp"

inherit rpm
