SUMMARY = "XML validator for COLLADA files"
DESCRIPTION = "XML validator for COLLADA files, based on the COLLADASaxFrameworkLoader."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-utils-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "58b50e76c534c006f464254d4ba89922dc75701e49f1bb98650b891b7d356a34da51a6bed6dcd4cc8a3202cfc685d4fa3de13b7acffdfb66dd580a23880f06cb"

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
