SUMMARY = "Library to access Blu-Ray disks - Development files"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray-devel-1.3.4-1.3.aarch64.rpm"
RPM_HASH = "1e4f4633aff968a2bf91cb1a24be24694f2a320de4ba59598ea84805843c0e74b5c256d37dfa83cc4f67263a14ce9f85c71e6a492806d6ea04f7dc285c1f6e9a"

RPROVIDES:${PN} += "libbluray-devel \
libbluray-devel(aarch-64) \
pkgconfig(libbluray)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluray2"

inherit rpm
