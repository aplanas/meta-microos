SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "The qt5pas-devel package contains libraries and header files for \
developing applications that use qt5pas."
LICENSE = "LGPL-3.0-only"

PV = "2.2.6"

RPM_NAME = "libQt5Pas-devel-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "85d0c340872880bab6f54e2192a483b8e12b66ce3985318752920f9a54ae6a035b597ab792bfeb370469bfc16b409c1e4bf95a25715ff19568ae24aa46987665"

RPROVIDES:${PN} += "libQt5Pas-devel"

RDEPENDS:${PN} += "libQt5Pas1"

inherit rpm
