SUMMARY = "System for configuration files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ConfigCore5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c493d738513ac91a4a9432695a41a8f053a166a9ba318e58a6ff22b859c2d234939da76c75abcb2dc102bac652d01b06a3a5f2a35682652f6144f15db5c683cf"

RPROVIDES:${PN} += "libKF5ConfigCore.so.5 \
libKF5ConfigCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
