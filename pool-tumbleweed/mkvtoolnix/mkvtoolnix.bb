SUMMARY = "Tools to Create, Alter, and Inspect Matroska Files"
DESCRIPTION = "Tools to create and manipulate Matroska files (extensions .mkv and .mka), a new \
container format for audio and video files. Includes command line tools \
mkvextract, mkvinfo, mkvmerge and mkvpropedit."
LICENSE = "GPL-2.0-or-later"

PV = "77.0"

RPM_NAME = "mkvtoolnix-77.0-1.1.aarch64.rpm"
RPM_HASH = "2b2cef84de427d3efe0d8fd8233e6b58d89d3817eaaf5d446ec77a77f0cc44064a373cf71e55664bc1ac714f5f270232b30135c41d72324c57e3133bfa8f7664"

RPROVIDES:${PN} += "mkvtoolnix \
mkvtoolnix(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libdvdread.so.8()(64bit) \
libebml.so.5()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmatroska.so.7()(64bit) \
libogg.so.0()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvorbis.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
