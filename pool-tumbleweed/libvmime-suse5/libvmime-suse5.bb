SUMMARY = "Library for working with MIME messages and IMAP/POP/SMTP"
DESCRIPTION = "VMime is a C++ class library for working with RFC5322 and \
MIME-conforming messages (RFC2045–2049), as well as Internet \
messaging services like IMAP, POP or SMTP. \
 \
VMime can parse, generate and modify messages, and also connect to \
store and transport services to receive or send messages over the \
Internet. The library offers features to build a mail client."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.2.175"

RPM_NAME = "libvmime-suse5-0.9.2.175-2.4.aarch64.rpm"
RPM_HASH = "0ac77c3279800718dce34030b739599bd58fbcf522a63da8decf6f3b455cc0357025d7ca99519beacef5c8e21ca5a2fce43de238161ce092851d4f32093f806c"

RPROVIDES:${PN} += "libvmime-suse.so.5()(64bit) \
libvmime-suse5 \
libvmime-suse5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgsasl.so.7()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
