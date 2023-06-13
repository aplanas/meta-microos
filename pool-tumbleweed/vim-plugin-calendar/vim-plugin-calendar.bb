SUMMARY = "Calendar for vim"
DESCRIPTION = "Plugin for vim that displays simple calendar in the side window."
LICENSE = "BSD-3-Clause"

PV = "2.5"

RPM_NAME = "vim-plugin-calendar-2.5-55.1.noarch.rpm"
RPM_HASH = "5a1c0ef72b32b031f2c7690a2f9623b7983a219407246f401bae2be5095e9b9be21cb3dba74b680ca6371eeb94cfb688f940ebfa76c20da60e1fc6e1b2c07780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-calendar"

RDEPENDS:${PN} += "vim"

inherit rpm
