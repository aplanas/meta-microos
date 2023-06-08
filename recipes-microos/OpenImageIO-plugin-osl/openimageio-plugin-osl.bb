SUMMARY = "OpenImageIO input plugin"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This is a plugin to access OSL from OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenImageIO-plugin-osl-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "c75ed400b09f058cd4a7779b13b485c68d48cf475b2cd53328f14ec0e197353bc7d0c1e35fcf6db07342900735796b820b4f65e7a4a4e66bb5b1aa89404edacf"

RPROVIDES:${PN} += "OpenImageIO-plugin-osl OpenImageIO-plugin-osl(aarch-64) osl.imageio"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenImageIO.so.2.4()(64bit) libOpenImageIO_Util.so.2.4()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) liboslexec.so.1.12()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
