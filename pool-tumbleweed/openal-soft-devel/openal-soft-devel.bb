SUMMARY = "Development headers for OpenAL Soft"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This subpackage contains libraries and header files for developing \
applications that want to make use of openal-soft."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "openal-soft-devel-1.22.2-1.5.aarch64.rpm"
RPM_HASH = "b36b474784a49140cc879d60b66191b45d8fb10af01b68f24796a7adbb51a4a5cbcff5e18216957363c81a1a68bc42dc25a9dabaa1d22344cf1276033e4c35da"

RPROVIDES:${PN} += "cmake-OpenAL \
openal-devel \
openal-soft-devel \
pkgconfig-openal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libopenal1"

inherit rpm
