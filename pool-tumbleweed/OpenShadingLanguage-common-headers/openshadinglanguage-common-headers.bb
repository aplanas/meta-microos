SUMMARY = "OSL standard library and auxiliary headers"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains the OSL standard library headers, as well \
as some additional headers useful for writing shaders."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-common-headers-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "28b232ee5d6b0194309d56127515a318b2eac42f09d8acef01c51184fc454fd4cf1155e3ef357913ada533be2a79cb21c137a47cc672fb894c815feda439b449"

RPROVIDES:${PN} += "OpenShadingLanguage-common-headers \
OpenShadingLanguage-common-headers(aarch-64)"

RDEPENDS:${PN} += "OpenShadingLanguage"

inherit rpm
