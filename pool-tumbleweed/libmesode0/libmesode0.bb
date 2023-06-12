SUMMARY = "An XMPP library for C"
DESCRIPTION = "Mesode is a collection of libraries for speaking the XMPP protocol. \
It focus extends chat-based applications; it has has been used to \
implement real-time games, notification systems, and search engines."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.10.1"

RPM_NAME = "libmesode0-0.10.1-1.11.aarch64.rpm"
RPM_HASH = "f2d488fe57ea08cacdcac4a898f69603deda76eed3298633347ae0edbac8c4148772544d8954b8206ccf5124077139a93dc01f41aaf093af70020d12c0874c99"

RPROVIDES:${PN} += "libmesode.so.0()(64bit) \
libmesode0 \
libmesode0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libexpat.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
