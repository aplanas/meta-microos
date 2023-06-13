SUMMARY = "A language for programmable shading"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains the standalone oslc compiler and some \
utilities."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "d56b244b726c91333ee0b3890c1f586c4da0446f16337c24fc5006f763983576b080bb0ce0a188817ff29e4cb5547cb8d18dd52fa78811a47861aee3af3a191d"

RPROVIDES:${PN} += "OpenShadingLanguage \
OpenShadingLanguage(aarch-64)"

RDEPENDS:${PN} += "OpenShadingLanguage-common-headers \
ld-linux-aarch64.so.1()(64bit) \
libOpenImageIO.so.2.4()(64bit) \
libOpenImageIO_Util.so.2.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
liboslcomp.so.1.12()(64bit) \
liboslexec.so.1.12()(64bit) \
liboslquery.so.1.12()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
