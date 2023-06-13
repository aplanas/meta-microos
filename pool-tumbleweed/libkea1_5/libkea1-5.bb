SUMMARY = "An implementation of the GDAL data model"
DESCRIPTION = "KEALib provides an implementation of the GDAL data model."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libkea1_5-1.5.0-2.3.aarch64.rpm"
RPM_HASH = "9c2152e399a905a78aa6d26e072da2c4b8b6851d1857562c6115d11d8598dc6669c03b30db5eaaca21154721ce4b324905f1cb80c41aae0050d1bce94e6c7df2"

RPROVIDES:${PN} += "libkea.so.1.5()(64bit) \
libkea1_5 \
libkea1_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_cpp.so.200()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
