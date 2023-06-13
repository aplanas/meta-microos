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

RPROVIDES:${PN} += "apitrace \
apitrace(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
apitrace-wrappers \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libprocps.so.8()(64bit) \
libprocps.so.8(LIBPROCPS_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
python3-Pillow \
python3-curses \
python3-numpy"

inherit rpm
