SUMMARY = "Tools for tracing OpenGL"
DESCRIPTION = "apitrace consists of a set of tools to: \
- trace OpenGL, OpenGL ES, Direct3D, and DirectDraw APIs calls to a file; \
- replay the recorded calls from a file, on any machine and, for OpenGL and OpenGL ES, on any operating system; \
- inspect state at any call while replaying; \
- view framebuffers and textures; \
- view call data; \
- edit trace files; \
- profile performance of traces;"
LICENSE = "MIT"

PV = "10.0"

RPM_NAME = "apitrace-10.0-2.10.aarch64.rpm"
RPM_HASH = "79b2b744da84255a8915a65d66edf3e0d877cbb236dff1ae30045206d3d0ae2f3334d7640c368e0a9a8e982c55aa0612c208aaea1b6c8d2aa071f247ee6f6185"

RPROVIDES:${PN} += "apitrace"

RDEPENDS:${PN} += "/usr/bin/python3 \
apitrace-wrappers \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libprocps.so.8 \
libstdc++.so.6 \
libz.so.1 \
python3-Pillow \
python3-curses \
python3-numpy"

inherit rpm
