SUMMARY = "Qt 6 NetworkAuth library"
DESCRIPTION = "The Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6NetworkAuth6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0d3240190422cfe1568b33a9dde310e728bdd8c05df430e09089735892da60cc66958462165cfbb9ccf9bf49ac02b66b70f0d4df0cfbf20cd214479f75f43bda"

RPROVIDES:${PN} += "libQt6NetworkAuth.so.6()(64bit) \
libQt6NetworkAuth.so.6(Qt_6)(64bit) \
libQt6NetworkAuth6 \
libQt6NetworkAuth6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
