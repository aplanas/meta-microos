SUMMARY = "Mailutils's incoming e-mail notification daemon"
DESCRIPTION = "Comsatd is the server which receives reports of incoming mail and \
notifies users wishing to get this service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-notify-3.16-1.2.aarch64.rpm"
RPM_HASH = "86d7db3abccbf15743553dd49329841303bd736eaf8a7a47962439bef50a09f205ed327c0a89dc6e762414b23a4b8bd9ea8a7d4d321a9e644886f736dc8c0da8"

RPROVIDES:${PN} += "mailutils-notify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmailutils.so.9 \
libmu-dotmail.so.9 \
libmu-imap.so.9 \
libmu-maildir.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmu-pop.so.9"

inherit rpm
