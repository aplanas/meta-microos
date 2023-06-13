SUMMARY = "A multimedia file converter"
DESCRIPTION = "A program to convert your multimedia files to contemporary formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-0.2.4-1.22.aarch64.rpm"
RPM_HASH = "92b213edcf688e5ff8c4c221ae67d700edad869f7a437404fadc772e55cab6e1777298d854f87616afe9dfca2c8f5fb659b7ebe3b2c6abd82d28e3d90621e25a"

RPROVIDES:${PN} += "application() \
application(com.github.robertsanseries.ciano.desktop) \
ciano \
ciano(aarch-64) \
metainfo() \
metainfo(com.github.robertsanseries.ciano.appdata.xml)"

RDEPENDS:${PN} += "ImageMagick \
ffmpeg \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
