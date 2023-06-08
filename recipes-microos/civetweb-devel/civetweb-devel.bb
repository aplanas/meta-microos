SUMMARY = "Header files and development libraries for civetweb"
DESCRIPTION = "This package contains the header files and development libraries \
for civetweb. If you like to develop programs embedding civetweb on them, \
you will need to install civetweb-devel and check civetweb's API at its \
comprisable header file."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "civetweb-devel-1.15-2.8.aarch64.rpm"
RPM_HASH = "6108a3b55c3b6d3526c600d235291d69ecc19dae2f346a93f61df2e1f6c94979b8a1c06144395e267e3c3f934db1376f468c153849999a2551dad781136eb1c4"

RPROVIDES:${PN} += "civetweb-devel civetweb-devel(aarch-64) cmake(civetweb)"
RDEPENDS:${PN} += "libcivetweb-cpp1_15_0 libcivetweb1_15_0"

inherit rpm
