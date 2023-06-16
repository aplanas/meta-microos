SUMMARY = "Tango Icon Theme"
DESCRIPTION = "This is the Tango base theme. On top of that, the package includes \
some specific icons from the legacy tango-icon-theme-extras package."
LICENSE = "CC-BY-SA-2.5"

PV = "0.8.90"

RPM_NAME = "tango-icon-theme-0.8.90-29.14.noarch.rpm"
RPM_HASH = "3dfaba6d1ee95851adfdae0b922011847d86091b92b3d3c572f25d4ec4505ba6ccbbae36bb9ca58092531524ca2657c994cbb28078c4c414f9773a3ae0240c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tango-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
