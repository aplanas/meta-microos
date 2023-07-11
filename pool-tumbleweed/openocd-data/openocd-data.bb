SUMMARY = "Hardware Scripts for OpenOCD"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices. \
This package provides hardware description files and documentation."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-data-0.12.0-2.4.noarch.rpm"
RPM_HASH = "09d26b346322366445dfd7bba109ee390652660c894d7c043b7f36efee77e1f44bd91e14bb4ac6b8bb682f68fe1341638685e66d720660e8c59bf2f348dc7e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openocd-data"

RDEPENDS:${PN} += "openocd"

inherit rpm
