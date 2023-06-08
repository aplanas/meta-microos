SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswresample-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "a74761c086441a6e91ed007d5b750a861d341945baa29402475eb03624553539e9fba39d05469b95828f0abc5a5799083f2c535b99b663c7533f9feea81ee02d"

RPROVIDES:${PN} += "ffmpeg-6-libswresample-devel ffmpeg-6-libswresample-devel(aarch-64) libswresample-devel pkgconfig(libswresample)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavutil-devel libswresample4 pkgconfig(libavutil)"

inherit rpm
