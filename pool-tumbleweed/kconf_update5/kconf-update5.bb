SUMMARY = "Configuration file access"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
This package contains the kconf_update tool."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kconf_update5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "526dfee1e6d50b8e4b6a8e612d95d2daa26266cf362ce9c58116fe7af60bcd42e7b0e342449e33d27b4c4c53ca4912bf28920c8d850f17fcc4b0a153a7145e12"

RPROVIDES:${PN} += "kconf-update5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigCore5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
