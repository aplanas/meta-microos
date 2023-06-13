SUMMARY = "Helsinki Finite-State Transducer Technology Libraries"
DESCRIPTION = "The Helsinki Finite-State Transducer software is intended for the \
implementation of morphological analyzers and other tools which are \
based on weighted and unweighted finite-state transducer technology."
LICENSE = "GPL-3.0-only"

PV = "3.15.4"

RPM_NAME = "libhfst53-3.15.4-1.3.aarch64.rpm"
RPM_HASH = "82cfdc457b897866cb47de1ccef29018c60ddcd891b3d72aec135e3b48e27c3ac5c1345afbb935dd6da877de2cfd1f9228abfbe18832c5a6cbff4f801c5ff2c4"

RPROVIDES:${PN} += "libhfst.so.53()(64bit) \
libhfst53 \
libhfst53(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfoma-hfst.so.0()(64bit) \
libfst-hfst.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpthread.so.0()(64bit) \
libreadline.so.8()(64bit) \
libsfst-hfst.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
