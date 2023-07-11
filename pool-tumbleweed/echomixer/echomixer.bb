SUMMARY = "Echoaudio console application"
DESCRIPTION = "This is Linux-equivalent of the Echoaudio console application."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "echomixer-1.0.5-24.4.aarch64.rpm"
RPM_HASH = "b125bceb4c72a4fe9facff1862acd5cb5ca006c7c786ca5338ba6aa984e2163e348678c72600e7be9945a86ef2e34745d9a5555c3701abedabadea9b1a92335f"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/echomixer \
echomixer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
