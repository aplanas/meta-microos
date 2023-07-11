SUMMARY = "Linux Audio Session Handler"
DESCRIPTION = "LASH (formerly LADCCA) is a session management system for JACK and ALSA \
audio applications on GNU/Linux. Its aim is to allow you to have many \
different audio programs running at once and to save the setup, close \
them down, then reload the setup at some other time."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "lash-0.5.4-2.12.aarch64.rpm"
RPM_HASH = "5eee7cd88bd4348e2d20f824fadc13f302966abd540c2b968f91a070d85f06aadd2a7509e6bb640a84f8073e0a44a9efad9a11cd04bd4b3d797b6fd1de69ad82"

RPROVIDES:${PN} += "lash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
liblash.so.1 \
libm.so.6 \
libreadline.so.8 \
libuuid.so.1 \
libxml2.so.2"

inherit rpm
