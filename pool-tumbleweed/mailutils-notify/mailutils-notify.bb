SUMMARY = "Mailutils's incoming e-mail notification daemon"
DESCRIPTION = "Comsatd is the server which receives reports of incoming mail and \
notifies users wishing to get this service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-notify-3.16-1.3.aarch64.rpm"
RPM_HASH = "dac81d04416872d1e8019a657c4fd090d6a8aa0da09505a74f13f51a71913ca429410a8d66bb00d68902b3f755d247d35d57de697d333da2441576ea3305846b"

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
