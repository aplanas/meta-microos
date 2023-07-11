SUMMARY = "Qt 5 translations"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
This package contains translations for Qt5 toolkit and it's applications."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qttranslations-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d264837a672aafd15c755966fe7a29f4a733ff85786afc997a111e035faea351e3bef584d42904e9a20fc6ed1387ad11123f3d51f68e912355970e00db0a1e6e"

RPROVIDES:${PN} += "libqt5-qttranslations"

RDEPENDS:${PN} += ""

inherit rpm
