SUMMARY = "Qt 5 translations"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
This package contains translations for Qt5 toolkit and it's applications."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qttranslations-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "efa0b21871dee06f151bf7f027bbac9c7821e65e7fd09ba5b728ccb9930555cecafa947d2de6d2ce722c685b1de90a2cf269fa053ce4050ef1da04f133f0f916"

RPROVIDES:${PN} += "libqt5-qttranslations"

RDEPENDS:${PN} += ""

inherit rpm
