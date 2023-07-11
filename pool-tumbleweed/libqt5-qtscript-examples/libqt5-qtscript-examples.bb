SUMMARY = "Qt5 Script examples"
DESCRIPTION = "Examples for libqt5-qtscript module."
LICENSE = "BSD-3-Clause"

PV = "5.15.14"

RPM_NAME = "libqt5-qtscript-examples-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "bdf19aee569f82104e8d2cb9fd80bb54b3b4095e24f65a0c43f461109eca74e1a186d42951440691b2e1b66a7080a884c2958249338345e6349c8dbf5c9403e0"

RPROVIDES:${PN} += "libqt5-qtscript-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5ScriptTools.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
