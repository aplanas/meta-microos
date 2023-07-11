SUMMARY = "Library to parse Passbook files"
DESCRIPTION = "kpkpass is a library to read and parse Apple Passbook files, such as the ones \
commonly used for hotel and flight reservations. This package contains the \
library itself."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5PkPass5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e0dc3b5e0f48e2f100571bf9e0db5ade899d67558fba8299d3cee42b12876935c030490129398f503205ecd870a5a5a474e84e6ad29c8f0c109689f9d238a899"

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
