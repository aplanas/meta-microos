SUMMARY = "Development files for aircrack-ng"
DESCRIPTION = "Development files for aircrack-ng."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "aircrack-ng-devel-1.7-2.3.noarch.rpm"
RPM_HASH = "f25aa65b4eb7dc02e69be61f40be4b74eaa1ac4fa06a4fbff8225cc3d9303e07018fdce4d8372ef0178793d21975e7758a6cb7709ee0a71f959b0cbade7129ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aircrack-ng-devel"

RDEPENDS:${PN} += "aircrack-ng"

inherit rpm
