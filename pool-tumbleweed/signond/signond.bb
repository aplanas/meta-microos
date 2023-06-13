SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signond-8.60-2.18.aarch64.rpm"
RPM_HASH = "83345289bd5101b7454c4851f5e7a158aef32aaa150cbe7cdd66c6b03a11c2a100f30733f300cdc19c12035043147f405db0759b992e236eaedcbec5b0b368e1"

RPROVIDES:${PN} += "config(signond) \
signond \
signond(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libproxy.so.1()(64bit) \
libsignon-extension.so.1()(64bit) \
libsignon-plugins-common.so.1()(64bit) \
libsignon-plugins.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
