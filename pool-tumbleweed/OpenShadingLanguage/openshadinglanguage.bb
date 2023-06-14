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

RPROVIDES:${PN} += "OpenShadingLanguage"

RDEPENDS:${PN} += "OpenShadingLanguage-common-headers \
ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.2.4 \
libOpenImageIO.so.2.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
liboslcomp.so.1.12 \
liboslexec.so.1.12 \
liboslquery.so.1.12 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
