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

RPM_NAME = "apitrace-10.0-2.11.aarch64.rpm"
RPM_HASH = "9342e226972061bf04dd2d3bca93f2fb484ab2efe4dd77d0c33adeee834d59e3e1878829cfd96f37e2b13c3dd1563a990ea72b2d1117fccad489e741373211c1"

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
