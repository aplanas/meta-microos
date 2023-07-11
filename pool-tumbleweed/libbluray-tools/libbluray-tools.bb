SUMMARY = "Library to access Blu-Ray disk - Utilities"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray-tools-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "ef7dc97837954a388aca5d93c8a1ebdf738ce65df7edac0615055750c9d85f53ef9846d99586396f8237d439bd28c932f21e7e8aa92dec9a2c6488fe2bccea78"

RPROVIDES:${PN} += "libbluray-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluray.so.2 \
libc.so.6"

inherit rpm
