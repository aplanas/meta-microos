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

RPM_NAME = "isync-1.4.4-2.3.aarch64.rpm"
RPM_HASH = "b22329ec1b7b401b743f3f54362fe3f32c14f7f05c47e1a2d3dbfdbe674baf4a83adfb212317a22ca05419511ef2633132c8e71f83e6badc817f8504bc61542c"

RPROVIDES:${PN} += "isync \
isync(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdb-4.8.so()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm