SUMMARY = "Low-latency internet connection tool for real-time jam sessions"
DESCRIPTION = "The Jamulus software enables musicians to perform real-time jam sessions over \
the internet. There is one server running the Jamulus server software which \
collects the audio data from each Jamulus client software, mixes the audio data \
and sends the mix back to each client."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.1"

RPM_NAME = "Jamulus-3.9.1-1.3.aarch64.rpm"
RPM_HASH = "a69e864f50892e1d415f2c9805c872000aac6e641c0dfe53ad4582d1f657efc694e974a61659d5c64ac9b78d66e8a2b2b055f9c50febb04a796628208d083387"

RPROVIDES:${PN} += "Jamulus \
jamulus \
llcon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-nogroup \
jack \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libopus.so.0 \
libstdc++.so.6 \
shadow \
systemd"

inherit rpm
