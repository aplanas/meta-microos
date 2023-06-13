SUMMARY = "Data files for STK, a music synthesis library"
DESCRIPTION = "Data files for STK."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "stk-data-4.6.2-1.3.noarch.rpm"
RPM_HASH = "20d1d099fbea6c825edca42958a0e0fee1337b61fa1cc5795b35d8a69e74233ad79cae22e2431ac1d749ff9adfac9c853d61bc15c350bb4759700baf4439ceec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stk-data"

RDEPENDS:${PN} += ""

inherit rpm
