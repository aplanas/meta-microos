SUMMARY = "A Qt C++ Library for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm5-1-1.1.0-1.11.aarch64.rpm"
RPM_HASH = "0767255423275320583d333b2d4e60286f39316d9e9708570058512e0afd2bce09f47694a3a0e223aa656b5a97e07b74f69688fc802bd09f65585ae64e455fe0"

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
