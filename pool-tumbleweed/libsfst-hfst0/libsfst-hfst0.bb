SUMMARY = "SFST Finite State Tools"
DESCRIPTION = "SFST is a toolkit for the implementation of morphological analyzers \
and other tools which are based on finite state transducer \
technology."
LICENSE = "GPL-2.0-only"

PV = "3.15.4"

RPM_NAME = "libsfst-hfst0-3.15.4-1.3.aarch64.rpm"
RPM_HASH = "1c1395f32c03348d746575e70007df57154ab39374c73113b9347eee55379ee79c9bd0e4308e2ef69f17b491b0007d7a26e504f67bd3b7bfc02e927d25efdb3c"

RPROVIDES:${PN} += "libsfst-hfst.so.0()(64bit) \
libsfst-hfst0 \
libsfst-hfst0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
