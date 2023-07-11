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

RPM_NAME = "libvmime-suse5-0.9.2.175-2.5.aarch64.rpm"
RPM_HASH = "5a2063dcb27dd9e5251a301ee23eecb811cc035072e890663a8bb45cd61becd56f21c5df199e5130a402a39c668fee4af70a82f559fba5ecd42f4b9a5fcfd6ce"

RPROVIDES:${PN} += "libvmime-suse.so.5 \
libvmime-suse5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libgsasl.so.7 \
libstdc++.so.6"

inherit rpm
