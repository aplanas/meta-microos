SUMMARY = "Library to access Blu-Ray disks - Development files"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray-devel-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "cf591c30fff96327a3f00e3b8004daf879926b4af8fef736b78e1ff61b3dad8a047ad5e03db7e89c4d555df7a3ca2eedea2cfb19c87532aad4e0a4d3028b236d"

RPROVIDES:${PN} += "libbluray-devel \
pkgconfig-libbluray"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluray2"

inherit rpm
