SUMMARY = "Mail handling library"
DESCRIPTION = "libEtPan is a mail purpose library. It will be used for low-level mail \
handling: network protocols (IMAP/NNTP/POP3/SMTP over TCP/IP and \
SSL/TCP/IP, already implemented), local storage (mbox/MH/maildir) \
and message / MIME parsing."
LICENSE = "BSD-3-Clause"

PV = "1.9.4"

RPM_NAME = "libetpan20-1.9.4-1.14.aarch64.rpm"
RPM_HASH = "a69ab1809d20f9950deecdab24a1e768ffc662c946b34850ebe2bb0581d7e8745cdd1fcbe80dde0f9370dc441539ea76ce7676a98efdb41fa0300f3a152ce7c5"

RPROVIDES:${PN} += "libetpan \
libetpan.so.20 \
libetpan20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libsasl2.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
