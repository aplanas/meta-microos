SUMMARY = "High Quality Television Application"
DESCRIPTION = "tvtime is a high quality television application for use with video \
capture cards.	tvtime processes the input from a capture card and \
displays it on a computer monitor or projector.  Unlike other \
television applications, tvtime focuses on high visual quality."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.11"

RPM_NAME = "tvtime-1.0.11-2.17.aarch64.rpm"
RPM_HASH = "56a05e448410978549e1b9e9cbf6f3fd59e49b8d5975cc1a201950688a65b99d9772b089b4ef974e23a4436873317aaf2c8f80ce2ac9085464fd64eed36b53b4"

RPROVIDES:${PN} += "config-tvtime \
tvtime"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXv.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libpng16.so.16 \
libxml2.so.2"

inherit rpm
