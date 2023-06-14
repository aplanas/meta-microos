SUMMARY = "Mail handling library"
DESCRIPTION = "libEtPan is a mail purpose library. It will be used for low-level mail \
handling: network protocols (IMAP/NNTP/POP3/SMTP over TCP/IP and \
SSL/TCP/IP, already implemented), local storage (mbox/MH/maildir) \
and message / MIME parsing."
LICENSE = "BSD-3-Clause"

PV = "1.9.4"

RPM_NAME = "libetpan20-1.9.4-1.13.aarch64.rpm"
RPM_HASH = "9294083a1029555ad10bb3874a0fb84c0a9b6362ca37f48ef0cb7c4bca3c6ccce196214d936509be35e9edb3652ea0580d6e799ac80e59462f0c93f6f769121f"

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
