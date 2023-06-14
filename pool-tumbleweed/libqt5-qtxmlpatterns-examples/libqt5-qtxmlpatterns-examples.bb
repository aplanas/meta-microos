SUMMARY = "Qt5 xmlpatterns examples"
DESCRIPTION = "Examples for the libqt5-qtxmlpatterns module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "3acbd7666ea6e640eebbb433f2c871d24ea829ca732c859bba3fef7132459ea7ce124d52ac333e6de4731e06bbb0a8ca791a6589df91d8f9aad3b14561faaac1"

RPROVIDES:${PN} += "libqt5-qtxmlpatterns-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
