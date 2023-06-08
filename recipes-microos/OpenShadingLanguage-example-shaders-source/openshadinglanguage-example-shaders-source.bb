SUMMARY = "OSL shader examples"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains some OSL example shaders."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-example-shaders-source-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "63e8f02d1387a5ad3b2dd9f85e8cd2474e2d704bf950e59934add26aa3e9279303e78b42e5be555d90d8a9b3e9ad2d3bcccbfe89c4b61607b97326526c8bc7c5"

RPROVIDES:${PN} += "OpenShadingLanguage-example-shaders-source OpenShadingLanguage-example-shaders-source(aarch-64)"
RDEPENDS:${PN} += "OpenShadingLanguage OpenShadingLanguage-common-headers"

inherit rpm
