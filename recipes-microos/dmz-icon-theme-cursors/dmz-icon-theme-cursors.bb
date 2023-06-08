SUMMARY = "DMZ Cursor Theme"
DESCRIPTION = "This package contains the DMZ cursor theme for X."
LICENSE = "CC-BY-SA-3.0"

PV = "11.3.0"

RPM_NAME = "dmz-icon-theme-cursors-11.3.0-3.10.noarch.rpm"
RPM_HASH = "7bc09213759e9cb26d5455d3df2821ef3d288e449a679a875d0af17482038eabf79d335fca21b3c038604a1b5e8390ba45d96a6cc659cf6014518d2b8967fc08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dmz-icon-theme-cursors icon-theme-dmz-cursors"
RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
