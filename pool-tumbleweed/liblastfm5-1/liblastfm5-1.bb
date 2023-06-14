SUMMARY = "A Qt C++ Library for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm5-1-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "affe048e12652109373deee8237aef149c82e64a29628b715e889ed050e2c588ec5507b6760797ce2ed9f3eb2d85456c8c9bbde821eb1aeedb9561ed81172fe3"

RPROVIDES:${PN} += "liblastfm5-1 \
liblastfm5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
