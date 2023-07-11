SUMMARY = "FDO Icon theme to go with openSUSE Enlightenment Theme"
DESCRIPTION = "An FDO Icon theme that matches the one used by the openSUSE Enlightenment \
theme"
LICENSE = "GPL-3.0-only"

PV = "20220219.1.26"

RPM_NAME = "openSUSE-e-X-Oliveleaf-Icons-20220219.1.26-1.12.noarch.rpm"
RPM_HASH = "d94b2e339ab43822a53f7022d8ce521417a6a6aeb4496f8ba8184e51f3114429571a7e6620a008cc54b9af4a7be57fd4556ed8c05b04652b5c4782b0bfaabb13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-e-X-Oliveleaf-Icons"

RDEPENDS:${PN} += ""

inherit rpm
