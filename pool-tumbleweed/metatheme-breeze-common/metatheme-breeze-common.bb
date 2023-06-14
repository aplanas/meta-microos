SUMMARY = "GTK+ theme matching KDE's Breeze -- Common Files"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.5"

RPM_NAME = "metatheme-breeze-common-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "eb8f796c2c779034998c857f227fce159ffbfd67169bdbf471183ac80665d6ee3cc7d99a61159768ed64b2c041e0bbb9917509b8af393e5e8c77f70da09b850d"

RPROVIDES:${PN} += "breeze-gtk \
metatheme-breeze-common"

RDEPENDS:${PN} += ""

inherit rpm
