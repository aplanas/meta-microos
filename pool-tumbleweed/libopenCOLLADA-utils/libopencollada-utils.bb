SUMMARY = "XML validator for COLLADA files"
DESCRIPTION = "XML validator for COLLADA files, based on the COLLADASaxFrameworkLoader."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-utils-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "e1788fa681c37d19f10d61e29ebf09fc0cda99e28f80fa8dc40e33dcd813e8c5b8f9bdf6a452d5748cf4caf74da8846ceb18f1100e6d9c03769f94e143db4845"

RPROVIDES:${PN} += "libopenCOLLADA-utils \
openCOLLADA-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGeneratedSaxParser.so.0.3 \
libOpenCOLLADAFramework.so.0.3 \
libOpenCOLLADASaxFrameworkLoader.so.0.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
