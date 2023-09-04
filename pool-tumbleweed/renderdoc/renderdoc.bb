SUMMARY = "A frame-capture based graphics debugger"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.28"

RPM_NAME = "renderdoc-1.28-1.1.aarch64.rpm"
RPM_HASH = "4ffcfc2667fda938478998c17fc58f87a9243d0747a8e18c9999d4d604bce4acc2783417075839813dc1f3a42ab080549ae4478bd9175d63717c59c0279b2754"

RPROVIDES:${PN} += "librenderdoc.so \
renderdoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb.so.1"

inherit rpm
