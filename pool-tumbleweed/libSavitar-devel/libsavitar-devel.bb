SUMMARY = "Header files for libSavitar"
DESCRIPTION = "Development package for libSavitar."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libSavitar-devel-4.13.1-2.8.aarch64.rpm"
RPM_HASH = "f5597ac2f55fcac2408f04f930787ac7e94152b830ccc71a5b31d6c36e5dc0b7d5951a04e137fd98f9aebe57a8969589108f0ce94a540e1331c8527a5ee49d86"

RPROVIDES:${PN} += "cmake-Savitar \
libSavitar-devel"

RDEPENDS:${PN} += "libSavitar0 \
python3-sip-devel"

inherit rpm
