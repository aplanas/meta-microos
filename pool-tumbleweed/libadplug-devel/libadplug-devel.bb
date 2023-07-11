SUMMARY = "Development Files for libadplug"
DESCRIPTION = "AdPlug is a hardware independent AdLib sound player library. \
AdPlug plays sound data, originally created for the AdLib (OPL2) and \
Sound Blaster (Dual OPL2/OPL3) audio boards, directly from its original \
format on top of an emulator or by using the real hardware. \
No OPL chip is required for playback. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libadplug."
LICENSE = "LGPL-2.1-only"

PV = "2.3.3"

RPM_NAME = "libadplug-devel-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "b37a7c6e4350963b161e6a7adba13f027a386f959a78384b0b600fddec726cc4c6415c65d0dcf8672317c7da45f40b01f31caeaaf1b1ae549eb38a91c5e3d6e1"

RPROVIDES:${PN} += "libadplug-devel \
pkgconfig-adplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadplug2-3-3-0 \
pkgconfig-libbinio"

inherit rpm
