SUMMARY = "Linux Audio Session Handler"
DESCRIPTION = "LASH (formerly LADCCA) is a session management system for JACK and ALSA \
audio applications on GNU/Linux. Its aim is to allow you to have many \
different audio programs running at once and to save the setup, close \
them down, then reload the setup at some other time."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "lash-0.5.4-2.11.aarch64.rpm"
RPM_HASH = "2743434cc182bd3647d306b53e105ee72f59a9861a06a1539303c3eeaf3597a6b3750d3568acd0fa47954bb7911b979bd5a4b90f32fafee4b94a90f02b10770e"

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
