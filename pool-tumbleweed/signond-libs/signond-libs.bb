SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-libs-8.60-2.18.aarch64.rpm"
RPM_HASH = "3c52fae53cbe2cfe5e08f0884e9d6dcea9e882d2a8e4434c45d8d4d3336f159702fc452ae19d3cc2b240bc094d3e82fccf3d4191242b3489b78101781f7e9521"

RPROVIDES:${PN} += "libsignon-extension.so.1()(64bit) \
libsignon-plugins-common.so.1()(64bit) \
signond-libs \
signond-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
