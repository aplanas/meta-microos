SUMMARY = "Development files for libime"
DESCRIPTION = "This package provides development files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libime-devel-1.0.17-1.3.aarch64.rpm"
RPM_HASH = "03a82b49cf64e939e0853c16c8ba4309906cdb6ccfee864520ce12fe63b0d95458ff75c720ae6918e9d88adcf009eba783c3473a7c9e3c87dc6876e7e00831f2"

RPROVIDES:${PN} += "cmake-LibIMECore \
cmake-LibIMEPinyin \
cmake-LibIMETable \
libime-devel"

RDEPENDS:${PN} += "libIMECore0 \
libIMEPinyin0 \
libIMETable0"

inherit rpm
