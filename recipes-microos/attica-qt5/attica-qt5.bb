SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "attica-qt5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "11f9ce3c8cb6c4dc465f05e63f87522705915e3aa60de8911e65e1d5c631a432bf1676e4a997d4ff52151dcf068ba7381a924f48f5022a358feedc5eae0507b5"

RPROVIDES:${PN} += "attica-qt5 attica-qt5(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
