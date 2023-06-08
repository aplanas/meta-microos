SUMMARY = "Color Management Solution Geared Towards Motion Picture Production"
DESCRIPTION = "OpenColorIO (OCIO) is a color management solution geared towards motion picture \
production with an emphasis on visual effects and computer animation. \
 \
OCIO is compatible with the Academy Color Encoding Specification (ACES) and is \
LUT-format agnostic, supporting many popular formats."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-tools-2.1.2-2.5.aarch64.rpm"
RPM_HASH = "3ca0bd9b728a2c5140e6d4f93ba536e222ad187636c6ce42a348e6a56d0edd80d48529f063db520f8d75902cf88087a389076c2af5ef71f30621b3e3821afd80"

RPROVIDES:${PN} += "OpenColorIO-tools OpenColorIO-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLEW.so.2.2()(64bit) libGLU.so.1()(64bit) libGLX.so.0()(64bit) libOpenColorIO.so.2.1()(64bit) libOpenGL.so.0()(64bit) libOpenImageIO.so.2.4()(64bit) libOpenImageIO_Util.so.2.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglut.so.3()(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
