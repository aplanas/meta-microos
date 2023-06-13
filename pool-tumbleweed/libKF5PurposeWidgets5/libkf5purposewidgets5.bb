SUMMARY = "Framework to integrate services and actions - GUI library"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need. \
 \
This package contains the library files of the package needed to use GUI widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5PurposeWidgets5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "cca6f6665098d8e40cb69b194761aa65ae0489c587ac2197b115b86728522914d7b6ed4c18d0affc782c79b561a68eafd42066ca1236e88bfcb29f57423553e6"

RPROVIDES:${PN} += "libKF5PurposeWidgets.so.5()(64bit) \
libKF5PurposeWidgets5 \
libKF5PurposeWidgets5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
