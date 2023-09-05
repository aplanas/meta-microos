SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations. This package contains the \
library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5PkPass5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "667f42b92dab31d919b3cd7390c921af5390e3c1cb5bb18dd9ac7e8620e74a8db6303cdceaf64dfd97da688cde8b280c20dab2bf86e99c6199b1045f2fcdd152"

RPROVIDES:${PN} += "libKPim5PkPass.so.5 \
libKPim5PkPass5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
