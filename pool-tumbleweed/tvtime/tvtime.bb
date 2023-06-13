SUMMARY = "High Quality Television Application"
DESCRIPTION = "tvtime is a high quality television application for use with video \
capture cards.	tvtime processes the input from a capture card and \
displays it on a computer monitor or projector.  Unlike other \
television applications, tvtime focuses on high visual quality."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.11"

RPM_NAME = "tvtime-1.0.11-2.17.aarch64.rpm"
RPM_HASH = "56a05e448410978549e1b9e9cbf6f3fd59e49b8d5975cc1a201950688a65b99d9772b089b4ef974e23a4436873317aaf2c8f80ce2ac9085464fd64eed36b53b4"

RPROVIDES:${PN} += "application() \
application(tvtime.desktop) \
config(tvtime) \
metainfo() \
metainfo(tvtime.appdata.xml) \
tvtime \
tvtime(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXv.so.1()(64bit) \
libXxf86vm.so.1()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
