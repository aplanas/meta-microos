SUMMARY = "Development files for libetpan, a mail handling library"
DESCRIPTION = "libEtPan is a mail purpose library. It will be used for low-level mail \
handling: network protocols (IMAP/NNTP/POP3/SMTP over TCP/IP and \
SSL/TCP/IP, already implemented), local storage (mbox/MH/maildir) \
and message / MIME parsing."
LICENSE = "BSD-3-Clause"

PV = "1.9.4"

RPM_NAME = "libetpan-devel-1.9.4-1.14.aarch64.rpm"
RPM_HASH = "ebe64870359fb5b7fdd4e7fc1dd33cde78e59bb4503db9ed7a2bc1b380a787a679618d52188531919239c25db9e172a65c6e1edf81b6237f0c4a1e87e7236679"

RPROVIDES:${PN} += "libetpan-devel \
pkgconfig-libetpan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cyrus-sasl-devel \
db-devel \
libetpan20 \
openssl-devel"

inherit rpm
