SUMMARY = "Graphical USENET newsreader"
DESCRIPTION = "flnews is a FLTK-based client with graphical user interface to read \
USENET newsgroups."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "flnews-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "6f8cc85a2bfaac4b3ae11e02c6771db27fe74f99f8c7b88376a682aef84e3752e05ab3b4f1d0d2ac5f3b6b388d75eff12744296f686b71710331d429af341ac7"

RPROVIDES:${PN} += "application() \
application(flnews.desktop) \
flnews \
flnews(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libfltk.so.1.3()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
xdg-utils"

inherit rpm
