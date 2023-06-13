SUMMARY = "wxWidgets basic GUI class library"
DESCRIPTION = "Basic GUI classes such as GDI classes or controls are in this \
library. All wxWidgets GUI applications must link against this \
library, only console mode applications need not."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_core-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "271c8bfac8c88332003837f023925b749cdeb79a6b63504b6df267516464db08778934899e73f8da0018d15e25850ddbf285f796310743879961fd756ddc70d3"

RPROVIDES:${PN} += "libwx_qtu_core-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse9_0_0 \
libwx_qtu_core-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Test.so.5()(64bit) \
libQt5Test.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit)"

inherit rpm
