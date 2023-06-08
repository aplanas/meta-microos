SUMMARY = "OSL standard library and auxiliary headers"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation. \
 \
This package contains the OSL standard library headers, as well \
as some additional headers useful for writing shaders."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "OpenShadingLanguage-common-headers-1.12.10.0-1.2.aarch64.rpm"
RPM_HASH = "7709dae54573a2f3cd5c00c264f40a0eecd166e4aa36281741f7cdc7d6eecd9d012899913be874d581e32d9c85394d19ba239354f745a9ece29bbf0e8cc611c1"

RPROVIDES:${PN} += "OpenShadingLanguage-common-headers OpenShadingLanguage-common-headers(aarch-64)"
RDEPENDS:${PN} += "OpenShadingLanguage"

inherit rpm
