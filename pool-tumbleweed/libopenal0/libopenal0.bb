SUMMARY = "Audio library with an OpenGL-resembling API"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
libopenal.so.0 is just a wrapper around libopenal.so.1 for \
compatibility with old software."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libopenal0-1.22.2-1.4.aarch64.rpm"
RPM_HASH = "09c3a86cc6dd3f22cc7631067d1cb6ace43536c4fa3cfc2669dd8c8d41608b0a085f1d01a3e12fe28ac8cc9e8046fb6a853d81916893ccd5330d414d1c1618c4"

RPROVIDES:${PN} += "libopenal.so.0()(64bit) \
libopenal0 \
libopenal0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libopenal.so.1()(64bit)"

inherit rpm
