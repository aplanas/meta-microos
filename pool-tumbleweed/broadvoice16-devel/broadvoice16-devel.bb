SUMMARY = "BroadVoice 16 development files"
DESCRIPTION = "Header files for the libbv16 library."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice16-devel-1.2-3.8.aarch64.rpm"
RPM_HASH = "658aeec68354e5f2c9c3c1d770a93969adb7137aa4bc810252c13f3edadbf661209c984705ba98747bc825beeb438db880ed992019907d958e478521115ccd6a"

RPROVIDES:${PN} += "broadvoice16-devel"

RDEPENDS:${PN} += "broadvoice16"

inherit rpm
