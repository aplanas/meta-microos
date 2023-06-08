SUMMARY = "Documentation for OpenShadingLanguage"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
This package contains documentation."
LICENSE = "CC-BY-3.0"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-doc-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "f86325a21a81238f903cd58debaa8863078a0d1320ce17e5a2932c3254c21a6cbcc7073b214819579f7e1c52309413ef241bf6b89cb81c6503cd97f79ad62d44"

RPROVIDES:${PN} += "OpenShadingLanguage-doc OpenShadingLanguage-doc(aarch-64)"
RDEPENDS:${PN} += "OpenShadingLanguage"

inherit rpm
