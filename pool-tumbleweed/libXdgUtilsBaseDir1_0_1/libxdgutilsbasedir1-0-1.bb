SUMMARY = "Shared library for xdg-utils-cxx"
DESCRIPTION = "Implementation of the FreeDesktop specifications to be used in c++ projects. \
Shared library for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXdgUtilsBaseDir1_0_1-1.0.1-1.4.aarch64.rpm"
RPM_HASH = "ebf73c8a0249ea4a8046a38ef23833be1b675f66b1f824f610395adebbc27cffdfea3c373175ff24e1373ab694d7d5d23b86a30046d98eb83a839d885d1fd14e"

RPROVIDES:${PN} += "libXdgUtilsBaseDir.so.1.0.1 \
libXdgUtilsBaseDir1-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
