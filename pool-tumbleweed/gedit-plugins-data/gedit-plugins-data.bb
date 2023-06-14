SUMMARY = "Common data required by gedit plugins"
DESCRIPTION = "Common files required by all gedit plugins"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugins-data-44.1-1.3.aarch64.rpm"
RPM_HASH = "c96d008f155f66a3d9bdb9221fe5c1905ba4b8f7d5f227ff2bab53b491334ed032e7eb82579e5e298e150ec53a3c8cdd9ea7ee9545e2ef8da0754440dfc69eac"

RPROVIDES:${PN} += "gedit-plugins-data"

RDEPENDS:${PN} += "gedit"

inherit rpm
