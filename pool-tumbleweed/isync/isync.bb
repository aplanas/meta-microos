SUMMARY = "Utility to synchronize IMAP mailboxes with local maildir folders"
DESCRIPTION = "isync is a command line application which synchronizes mailboxes; currently \
Maildir and IMAP4 mailboxes are supported. New messages, message deletions \
and flag changes can be propagated both ways. isync is suitable for use in \
IMAP-disconnected mode. \
 \
Synchronization is based on unique message identifiers (UIDs), so no \
identification conflicts can occur (as opposed to some other mail \
synchronizers). Synchronization state is kept in one local text file per \
mailbox pair; multiple replicas of a mailbox can be maintained."
LICENSE = "GPL-2.0-only"

PV = "1.4.4"

RPM_NAME = "isync-1.4.4-2.4.aarch64.rpm"
RPM_HASH = "a972f1f40b935edcde483ed82893255eb218b96ca9dc4fc6f2f044807e00a155c05fc349a3754466ea5d1f0615313574dba64d806ab688ea49f82c044b38428b"

RPROVIDES:${PN} += "isync"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libsasl2.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
