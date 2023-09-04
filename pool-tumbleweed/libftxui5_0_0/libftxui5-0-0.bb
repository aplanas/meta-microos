SUMMARY = "A C++ library for terminal based user interfaces"
DESCRIPTION = "A C++ library for terminal based user interfaces."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "libftxui5_0_0-5.0.0-1.1.aarch64.rpm"
RPM_HASH = "71457aaf0584f1158e30c8b2888dcddbd728a9f3f2ddd3722bf5320385546dc7cdd32ad93638e7bd88673f6e3da2bb1598b0e907d8bbfeec5bfadf16371d7020"

RPROVIDES:${PN} += "libftxui-component.so.5.0.0 \
libftxui-dom.so.5.0.0 \
libftxui-screen.so.5.0.0 \
libftxui5-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
