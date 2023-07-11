SUMMARY = "QTermWidget data package"
DESCRIPTION = "Data files for qtermwidget library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "qtermwidget-qt5-data-1.3.0-1.2.noarch.rpm"
RPM_HASH = "8a171565da9c2d3a92581f03cb0f282b6109ce27dd43f6f348fff43734f4b2e5dda1cd686bd7e62bb63f6a43c4b99f100e7c497971ec55f0f6e0036faadf6c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtermwidget-qt5-data"

RDEPENDS:${PN} += "libqtermwidget5-1"

inherit rpm
