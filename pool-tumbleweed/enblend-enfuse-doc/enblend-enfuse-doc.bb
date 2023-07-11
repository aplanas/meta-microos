SUMMARY = "Usage Documentation for enblend and enfuse"
DESCRIPTION = "PDF usage documentation for the enblend and enfuse command line tools."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "enblend-enfuse-doc-4.2-6.15.aarch64.rpm"
RPM_HASH = "fddd6f0ab9897dbec8097264ae807b8d397c70d536ba853fe687d330816d12ec772ed6ec41aaab03ae154650cf5c1df992fc8612b26990f8af375e849b4b75cd"

RPROVIDES:${PN} += "enblend-enfuse-doc"

RDEPENDS:${PN} += ""

inherit rpm
