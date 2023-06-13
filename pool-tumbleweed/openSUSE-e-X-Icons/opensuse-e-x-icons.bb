SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220430.1.26"

RPM_NAME = "openSUSE-e-X-Icons-20220430.1.26-1.9.noarch.rpm"
RPM_HASH = "42d2a4fa17538971b454ca54611282c917b69e149fb8699462fe384fac5415bdf239f6533260bbf65a5077bbb5f37f6c1167106f4be33faed114be0e67765353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Icons"

RDEPENDS:${PN} += ""

inherit rpm
