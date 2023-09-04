SUMMARY = "Framework to integrate services and actions - GUI library"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need. \
 \
This package contains the library files of the package needed to use GUI widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5PurposeWidgets5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "1582905a6b8e04112acf6f9f78c0904edccdc0f267c18b28cc9926be515971abd9ece0cc132c2d44418e66ebf7e571cf3c6994d561063530aa98aef858368bb6"

RPROVIDES:${PN} += "libKF5PurposeWidgets.so.5 \
libKF5PurposeWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5Purpose.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
