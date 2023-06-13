SUMMARY = "Development files for libetpan, a mail handling library"
DESCRIPTION = "libEtPan is a mail purpose library. It will be used for low-level mail \
handling: network protocols (IMAP/NNTP/POP3/SMTP over TCP/IP and \
SSL/TCP/IP, already implemented), local storage (mbox/MH/maildir) \
and message / MIME parsing."
LICENSE = "BSD-3-Clause"

PV = "1.9.4"

RPM_NAME = "libetpan-devel-1.9.4-1.13.aarch64.rpm"
RPM_HASH = "1b765db46f81493b89a76701bc946a83b4c6dc2118437feed5ef7e12261a583c2b7664508c70bedcc48640150e4c66dbd1b2581ed1fd9803d21e3a54ecd6ffed"

RPROVIDES:${PN} += "libetpan-devel \
libetpan-devel(aarch-64) \
pkgconfig(libetpan)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cyrus-sasl-devel \
db-devel \
libetpan20 \
openssl-devel"

inherit rpm
