SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libstdc++6-locale-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "9694e7477dbe4a25d0bd7cccb88fd439b5af70160ee9011663f9fe4cde85e77b6acb7423363b88cece17ef2d1ce97e4ba3ffbfcac80d741eae6ccd07cd7e3907"

RPROVIDES:${PN} += "libstdc++6-locale \
locale-libstdc++6-de \
locale-libstdc++6-fr"

RDEPENDS:${PN} += ""

inherit rpm
