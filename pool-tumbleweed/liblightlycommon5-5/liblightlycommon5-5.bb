SUMMARY = "Lightly support code"
DESCRIPTION = "Lightly is a fork of breeze theme style that aims to be visually modern and minimalistic. \
 \
This package contains the support code of Lightly."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "liblightlycommon5-5-0.4.1-2.7.aarch64.rpm"
RPM_HASH = "8031a4aa9d21e336c83b694ce07d58b523bce41750e94ba78c211eb4987d17052211f398585d58afc7aaa5248eee8428fd5c178d39e88e662a495dcbbc4483c8"

RPROVIDES:${PN} += "liblightlycommon5-5 \
liblightlycommon5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
