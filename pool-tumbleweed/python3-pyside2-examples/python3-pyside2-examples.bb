SUMMARY = "Examples for using PySide2"
DESCRIPTION = "Examples and Tutorials for the PySide2 bindings for Qt."
LICENSE = "BSD-3-Clause"

PV = "5.15.10"

RPM_NAME = "python3-pyside2-examples-5.15.10-1.1.noarch.rpm"
RPM_HASH = "a7baa54339eefb42a5f98d18d3f5b023ffc77af7dd2fcfeb85abc754332015cb93bcd28f912c7ee54ce0ab36d254ede134925ab922b3224e6bad03b6502e6891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyside2-examples"

RDEPENDS:${PN} += "python3-pyside2 \
qt5qmlimport-QtCharts.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWebEngine.1"

inherit rpm
