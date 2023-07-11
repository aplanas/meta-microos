SUMMARY = "Library to access Blu-Ray disk"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray2-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "5ac27dac81f648ae08e82c6117f523630a6d3fc5ee1b3e0c8e04ab277929bad61ee8cfeb34655e59b63d38cc3ffa3eb72ce60158e867f4545975f87ef0883d2e"

RPROVIDES:${PN} += "libbluray.so.2 \
libbluray2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libxml2.so.2"

inherit rpm
