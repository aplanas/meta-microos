SUMMARY = "A language for programmable shading"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains the standalone oslc compiler and some \
utilities."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "891889bcf5479d7e1eaa1bd614c135c2313b1fe391f7edd513694a59fafa0be0176b8e02014a0ea7ace82d0eac24a0a4a48e9378503c8187399d561a63a7143a"

RPROVIDES:${PN} += "OpenShadingLanguage OpenShadingLanguage(aarch-64)"
RDEPENDS:${PN} += "OpenShadingLanguage-common-headers ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenImageIO.so.2.4()(64bit) libOpenImageIO_Util.so.2.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) liboslcomp.so.1.12()(64bit) liboslexec.so.1.12()(64bit) liboslquery.so.1.12()(64bit) libpugixml.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
