SUMMARY = "Interactive Geometry"
DESCRIPTION = "Kig is an application for Interactive Geometry. It's intended to serve \
two purposes: Allow students to interactively explore mathematical \
figures and concepts using the computer. Serve as a WYSIWYG tool for \
drawing mathematical figures and including them in other documents."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kig-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6e35650cb70b18a15e55819d8a09aff1abda3870942eeebab596cb9ec07a1583443f24b4c046977cc38d19601b64a049a4607daf0b0ed3c7de9c3a059ce7745a"

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
libKF5Service.so.5 \
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
libpython3.10.so.1.0 \
libstdc++.so.6"

inherit rpm
