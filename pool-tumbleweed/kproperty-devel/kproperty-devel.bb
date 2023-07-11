SUMMARY = "Development package for kproperty"
DESCRIPTION = "Development package for the property editing Framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kproperty-devel-3.2.0-2.22.aarch64.rpm"
RPM_HASH = "8da73b7e7c49fee8484b804c80d12989402dd63824b80db11ad2af77aec0e898dc5d6d47096d8cea0fe454a029535ac12270343b882f7ca32634c6ac816d2151"

RPROVIDES:${PN} += "cmake-KPropertyCore \
cmake-KPropertyWidgets \
kproperty-devel"

RDEPENDS:${PN} += "libKPropertyCore3-4 \
libKPropertyWidgets3-4"

inherit rpm
