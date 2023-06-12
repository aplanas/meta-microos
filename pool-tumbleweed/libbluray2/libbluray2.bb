SUMMARY = "Library to access Blu-Ray disk"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray2-1.3.4-1.3.aarch64.rpm"
RPM_HASH = "b883e0399860ef27fe456c4d31958d170193731affda915272154ee8d65e39939b1c3c1a36c8846ecea0ec66ca9e37687a8010c1fffcbc32e1594c90845a7678"

RPROVIDES:${PN} += "libbluray.so.2()(64bit) \
libbluray2 \
libbluray2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm