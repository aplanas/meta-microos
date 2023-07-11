SUMMARY = "A multimedia file converter"
DESCRIPTION = "A program to convert your multimedia files to contemporary formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-0.2.4-1.23.aarch64.rpm"
RPM_HASH = "e5d2cb3bf2c4fdc07a0a4c3847d1b87884d5be48ca5b252140a57af82fbc1e6c14aad92b13c8e532400aaacc4048aefa6c83d9e4fe3537efc4925eed39c1ad98"

RPROVIDES:${PN} += "ciano"

RDEPENDS:${PN} += "ImageMagick \
ffmpeg \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
