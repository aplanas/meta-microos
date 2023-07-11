SUMMARY = "Command line client to QStandardPaths"
DESCRIPTION = "Command line client to QStandardPaths."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde3"

RPM_NAME = "libqt5-qtpaths-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "2530d744e090a050ceceb4c087485db8b240d5acc69a72254a98f4ca04eb7d31bb8dfa8cb9c3f52f6d8817b3b384d595e350dced1226aa339fb762be9affbee3"

RPROVIDES:${PN} += "libqt5-qtpaths"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6"

inherit rpm
