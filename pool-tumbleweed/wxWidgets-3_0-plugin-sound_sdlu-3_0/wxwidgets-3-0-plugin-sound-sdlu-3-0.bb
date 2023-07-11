SUMMARY = "wxWidgets SDL Plugin"
DESCRIPTION = "SDL Plugin for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-3_0-plugin-sound_sdlu-3_0-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "2ffa49253564eb34b9224d349ffff9749a7e483b17bcc46c8d961b602a4fcaa4ed82207ace48049e5eac4a1ce26a72a6ad331c0bbd9e9516e3de66cb0efb516e"

RPROVIDES:${PN} += "wxWidgets-3-0-plugin-sound-sdlu-3-0"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
