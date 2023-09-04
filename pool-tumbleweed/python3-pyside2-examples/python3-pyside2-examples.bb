SUMMARY = "Examples for using PySide2"
DESCRIPTION = "Examples and Tutorials for the PySide2 bindings for Qt."
LICENSE = "BSD-3-Clause"

PV = "5.15.10"

RPM_NAME = "python3-pyside2-examples-5.15.10-2.1.noarch.rpm"
RPM_HASH = "d7996a4987561f02452bd61ae99cecd7d269b2419711d48c4a1d4fe4b1ac1204731aba3a5dc60e15e21b7600e6bcbe01f21edc389f48f9f4502dd4361ed28b00"
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
