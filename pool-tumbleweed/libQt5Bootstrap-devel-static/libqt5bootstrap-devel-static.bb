SUMMARY = "Qt Bootstrap module"
DESCRIPTION = "Qt Bootstrap module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Bootstrap-devel-static-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "33d63c4820e1ae27214e0b76e8dc2cc484c54b390a454e37fbf32f78579829e030f1e0389650e00148fdcff8c031b24e6afeacdc91ffaf53a608f2f21bee0840"

RPROVIDES:${PN} += "libQt5Bootstrap-devel-static"

RDEPENDS:${PN} += "libqt5-qtbase-common-devel"

inherit rpm
