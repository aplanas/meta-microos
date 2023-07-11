SUMMARY = "Interactive Geometry"
DESCRIPTION = "Kig is an application for Interactive Geometry. It's intended to serve \
two purposes: Allow students to interactively explore mathematical \
figures and concepts using the computer. Serve as a WYSIWYG tool for \
drawing mathematical figures and including them in other documents."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kig-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3520d4821dcacfab1d05a217550fd08a52e8ee4759db8a025905a97bc465950f638d75145bd693b9b7a43df7b941541ee173d60a56c9543c5ae5cf8a532dbf20"

RPROVIDES:${PN} += "kig \
kig5"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5Parts.so.5 \
libKF5TextEditor.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6"

inherit rpm
