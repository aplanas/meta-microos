SUMMARY = "OSL shader examples"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains some OSL example shaders."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-example-shaders-source-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "c5c004c386adb2b620d4656b29f5e01a10b32cbb5aa3ead8e79f0de1116773b43cbe6394bbfc043bc853b10ab66b87de9884fcdf366c89e347657b86cb95d375"

RPROVIDES:${PN} += "OpenShadingLanguage-example-shaders-source"

RDEPENDS:${PN} += "OpenShadingLanguage \
OpenShadingLanguage-common-headers"

inherit rpm
