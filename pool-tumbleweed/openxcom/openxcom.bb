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

RPROVIDES:${PN} += "application() \
application(openxcom.desktop) \
openxcom \
openxcom(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_gfx.so.15()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libyaml-cpp.so.0.7()(64bit)"

inherit rpm
