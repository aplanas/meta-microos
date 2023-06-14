SUMMARY = "An open source reimplementation of the original X-Com game"
DESCRIPTION = "OpenXcom is an open-source clone of the original UFO: Enemy Unknown \
(X-Com: UFO Defense in USA), licensed under the GPL and written in C++ / SDL. \
 \
The goal of the project is to bring back the tried and true feel of the original \
with none of the issues. All the same graphics, sound and gameplay with a brand \
new codebase written from scratch. \
 \
User is required to have original gamedata (possible to obtain from e.g. Steam) \
installed to ~/.local/share/openxcom/data/"
LICENSE = "GPL-3.0-only"

PV = "1.0.0.1615230250.adb97235b"

RPM_NAME = "openxcom-1.0.0.1615230250.adb97235b-1.10.aarch64.rpm"
RPM_HASH = "2a97eead422f0b38d57ab95bd76a3d5408da69c56dbac7f027dcecef1036eff04b75f88b2baabeacb8daac4336e1b7108f23bb4b3d827dcb78c803ec199cc396"

RPROVIDES:${PN} += "openxcom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.15 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyaml-cpp.so.0.7"

inherit rpm
