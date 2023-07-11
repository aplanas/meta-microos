SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to use ixion parser and interpreter from cli."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "libixion-tools-0.17.0-3.5.aarch64.rpm"
RPM_HASH = "cad3ea6a14ae259c96d326f37674974916132f03be1dc478d5bdc1329dc294d480c51acd16cf0a006800c77b5f3e6e58f1a42c68a580f3ab9c289d2a295144ff"

RPROVIDES:${PN} += "libixion-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-system.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0-17-0 \
libixion-0.17.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
