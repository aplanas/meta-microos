SUMMARY = "Micro-compositor optimized for running video games on Wayland"
DESCRIPTION = "gamescope is a micro-compositor optimized for running video games on Wayland"
LICENSE = "BSD-2-Clause"

PV = "3.12.5+git0.a8471d8"

RPM_NAME = "gamescope-3.12.5+git0.a8471d8-1.1.aarch64.rpm"
RPM_HASH = "5344846229e3f4f71a869f06ce612d60777b398c7bc7062baccca0a089f05e1429967961f9550014b4fa59431b98d9ed6a2ec613af74c687541e3fdefd81f438"

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
