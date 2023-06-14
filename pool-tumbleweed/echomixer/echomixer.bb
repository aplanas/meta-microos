SUMMARY = "Echoaudio console application"
DESCRIPTION = "This is Linux-equivalent of the Echoaudio console application."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "echomixer-1.0.5-24.3.aarch64.rpm"
RPM_HASH = "660c128654a479ddf8ddcd0f67e5ca4b3a145aadeafe71f0ba0e9f9daf27845ac8f1f358a986fed2f35b68caae22281f975ae4e4a1c38aaa8345042739dbd7e3"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/echomixer \
echomixer"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
