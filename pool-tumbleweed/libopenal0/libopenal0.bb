SUMMARY = "Audio library with an OpenGL-resembling API"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
libopenal.so.0 is just a wrapper around libopenal.so.1 for \
compatibility with old software."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libopenal0-1.22.2-1.5.aarch64.rpm"
RPM_HASH = "61aaab850f646b3f50770e99e1c00d9ed4e44860a9ef702cb355fcbb8e8406f56ed10c9a1985b07b5736e550567b549788f67fad89adb761c4546b0be9962cbd"

RPROVIDES:${PN} += "libopenal.so.0 \
libopenal0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libopenal.so.1"

inherit rpm
