SUMMARY = "Hardware Scripts for OpenOCD"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices. \
This package provides hardware description files and documentation."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-data-0.12.0-2.3.noarch.rpm"
RPM_HASH = "774c45926ac1cd39a4cc6faa5c43954ad158d56ab37d4d9e2416959005c34ce28e160fa7a5e5f0f6661d16a6373026c52ed178585ffc9277f1c8d624b13dd4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openocd-data"

RDEPENDS:${PN} += "openocd"

inherit rpm
