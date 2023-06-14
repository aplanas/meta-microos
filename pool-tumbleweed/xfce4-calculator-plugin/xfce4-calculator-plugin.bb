SUMMARY = "Calculator plugin for the Xfce4 panel"
DESCRIPTION = "xfce4-calculator-plugin is a calculator plugin for the Xfce4 panel."
LICENSE = "GPL-2.0-only"

PV = "0.7.2"

RPM_NAME = "xfce4-calculator-plugin-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "ff0e90122c2a400ba798a2a935d136cdcb7a62ca86ef73ed0104d31be282d95d847c46a593dcfe37bd2b4de6a4eba88c8ab578374b1d6a63525543187e93b81d"

RPROVIDES:${PN} += "libcalculator.so \
xfce4-calculator-plugin \
xfce4-panel-plugin-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
