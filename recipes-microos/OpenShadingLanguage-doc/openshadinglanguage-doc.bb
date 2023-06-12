SUMMARY = "Documentation for OpenShadingLanguage"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
This package contains documentation."
LICENSE = "CC-BY-3.0"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-doc-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "63d17e707e991fee83bddf7b69a0dd5af03d0c3eb9f90aa70960d44ceff896051521f3fe80abad482727ab8ec70b376b8cff4e276f349812c5a5663e4eff7e8f"

RPROVIDES:${PN} += "OpenShadingLanguage-doc OpenShadingLanguage-doc(aarch-64)"
RDEPENDS:${PN} += "OpenShadingLanguage"

inherit rpm
