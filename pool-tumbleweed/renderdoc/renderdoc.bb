SUMMARY = "A frame-capture based graphics debugger"
DESCRIPTION = "RenderDoc is a frame-capture based graphics debugger, currently \
available for Vulkan, D3D11, D3D12, OpenGL, and OpenGL ES development."
LICENSE = "MIT"

PV = "1.26"

RPM_NAME = "renderdoc-1.26-1.1.aarch64.rpm"
RPM_HASH = "9f4d7a5f315e6cc337e53ff505661d9fb3ec0972bfb3880b065432cdd6fd53133ae289a930c0a300e175b341496522927ae7ce6535b5249ea7898ddacf5514bb"

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
libpython3.10.so.1.0 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb.so.1"

inherit rpm
