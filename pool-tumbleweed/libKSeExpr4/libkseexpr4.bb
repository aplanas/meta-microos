SUMMARY = "kseexpr libraries"
DESCRIPTION = "Runtime libraries for kseexpr."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "libKSeExpr4-4.0.4.0-1.10.aarch64.rpm"
RPM_HASH = "51fc3ea3029d8b88ca57fa474b1e3c374a4d391c4cdb9cf6f871688fe230104c47aa23ac4ebcd11725dec4581289a1974ff533743af6c0366d7d28ec2489f413"

RPROVIDES:${PN} += "kseexpr \
libKSeExpr.so.4 \
libKSeExpr4 \
libKSeExprUI.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
