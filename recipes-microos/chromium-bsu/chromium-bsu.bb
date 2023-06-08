SUMMARY = "Vertical Scrolling Space Shooter Game"
DESCRIPTION = "Chromium B.S.U. is a fast paced, arcade-style, top-scrolling space shooter. \
 \
You are captain of the cargo ship Chromium B.S.U., responsible for \
delivering supplies to our troops on the front line. Your ship has \
a small fleet of robotic fighters which you control from the relative \
safety of the Chromium vessel."
LICENSE = "ClArtistic & MIT"

PV = "0.9.16.1"

RPM_NAME = "chromium-bsu-0.9.16.1-1.18.aarch64.rpm"
RPM_HASH = "44708df541287c0b328023416ffba3808eedeb6eb78d50e5af6e756fca59bb915a85518e8671ce2e06f5c9f5c8d8c2919b9c7244d54a765994b4c9a4b199f9cf"

RPROVIDES:${PN} += "application() application(chromium-bsu.desktop) chromium-bsu chromium-bsu(aarch-64) config(chromium-bsu)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLC.so.0()(64bit) libGLU.so.1()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2_image-2.0.so.0()(64bit) libalut.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopenal.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
