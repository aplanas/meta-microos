SUMMARY = "Library for Qt Matrix Clients"
DESCRIPTION = "Library for Qt-based Matrix chat clients. It is required by \
Quaternion."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1.1"

RPM_NAME = "libQuotientQt6-0_8-0.8.1.1-1.1.aarch64.rpm"
RPM_HASH = "51f7f8592c404004e95d8fef573fbba3e8cfb76578d6d4784e946ab8a3c81b1dc037c77e1c65c6cd246a7c3eebed2b597d906d3a30e8347649aacdaf558c5eba"

RPROVIDES:${PN} += "libQuotientQt6-0-8 \
libQuotientQt6.so.0.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libolm.so.3 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
