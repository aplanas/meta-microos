SUMMARY = "Calculator plugin for the Xfce4 panel"
DESCRIPTION = "xfce4-calculator-plugin is a calculator plugin for the Xfce4 panel."
LICENSE = "GPL-2.0-only"

PV = "0.7.2"

RPM_NAME = "xfce4-calculator-plugin-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "ff0e90122c2a400ba798a2a935d136cdcb7a62ca86ef73ed0104d31be282d95d847c46a593dcfe37bd2b4de6a4eba88c8ab578374b1d6a63525543187e93b81d"

RPROVIDES:${PN} += "libcalculator.so()(64bit) \
xfce4-calculator-plugin \
xfce4-calculator-plugin(aarch-64) \
xfce4-panel-plugin-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit)"

inherit rpm
