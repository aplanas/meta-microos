SUMMARY = "Hardware Scripts for OpenOCD"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices. \
This package provides hardware description files and documentation."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-data-0.12.0-2.5.noarch.rpm"
RPM_HASH = "bc8a76909286e4494ccfa2c8645888cbb39fca3bd71e3c479c9aed8e91c5fe1966454abc9ac2407ebc4eacd85a657c624f2d96b9b259322c5bbe7a1ccdcf340b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openocd-data"

RDEPENDS:${PN} += "openocd"

inherit rpm
