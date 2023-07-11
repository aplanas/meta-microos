SUMMARY = "A frame-capture based graphics debugger"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.27"

RPM_NAME = "renderdoc-1.27-1.2.aarch64.rpm"
RPM_HASH = "a79110a2863af2fcd4ed50fe8ffcd16a9625c71d8aba5600b4353a793ebba34ab05047a02776cede356d2ffa73f53cae8229592f33e1c61e069fb810a6bd2650"

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
