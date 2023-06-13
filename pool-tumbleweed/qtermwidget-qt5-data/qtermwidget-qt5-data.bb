SUMMARY = "QTermWidget data package"
DESCRIPTION = "Data files for qtermwidget library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "qtermwidget-qt5-data-1.3.0-1.1.noarch.rpm"
RPM_HASH = "e629ce9073f96021194a5487e14136668874c18532e852f1875ebbb01632bb748915f8e22e914f9b272c30d1d8cfcb13a188c80ac7d0eb8ad5307798affe61fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtermwidget-qt5-data"

RDEPENDS:${PN} += "libqtermwidget5-1"

inherit rpm
