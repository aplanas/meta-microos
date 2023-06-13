SUMMARY = "XML validator for COLLADA files"
DESCRIPTION = "XML validator for COLLADA files, based on the COLLADASaxFrameworkLoader."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-utils-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "e1788fa681c37d19f10d61e29ebf09fc0cda99e28f80fa8dc40e33dcd813e8c5b8f9bdf6a452d5748cf4caf74da8846ceb18f1100e6d9c03769f94e143db4845"

RPROVIDES:${PN} += "libopenCOLLADA-utils \
libopenCOLLADA-utils(aarch-64) \
openCOLLADA-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGeneratedSaxParser.so.0.3()(64bit) \
libOpenCOLLADAFramework.so.0.3()(64bit) \
libOpenCOLLADASaxFrameworkLoader.so.0.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
