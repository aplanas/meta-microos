SUMMARY = "Micro-compositor optimized for running video games on Wayland"
DESCRIPTION = "gamescope is a micro-compositor optimized for running video games on Wayland"
LICENSE = "BSD-2-Clause"

PV = "3.12.3+git1.77d9432"

RPM_NAME = "gamescope-3.12.3+git1.77d9432-1.1.aarch64.rpm"
RPM_HASH = "02c42e99d8bb5055ddf6821979682be6e299425f18e3d5b80422f16b1f22caa9bd6e4f485c60870e391e3fa8f400ce842296dc15d3bec796e065cad93c869703"

RPROVIDES:${PN} += "gamescope \
libVkLayer-FROG-gamescope-wsi.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libX11-xcb.so.1 \
libX11.so.6 \
libXRes.so.1 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXmu.so.6 \
libXrender.so.1 \
libXtst.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libcap.so.2 \
libdrm.so.2 \
libgcc-s.so.1 \
libinput.so.10 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libseat.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
