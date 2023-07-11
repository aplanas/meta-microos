SUMMARY = "Deepin File Manager libraries"
DESCRIPTION = "This package contains the libraries for deepin-file-manager"
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "libdfm-extension5-5.6.4-3.9.aarch64.rpm"
RPM_HASH = "3bfd161aebe97ed3bb0bb92010ccedd5efa2cd478258b6e4c9db58811bf896ff465133362f156a857665c739b4d5a9ec1a3eedcb5e8691eb2bfdddebf0b17dd8"

RPROVIDES:${PN} += "libdfm-extension.so.5 \
libdfm-extension5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
