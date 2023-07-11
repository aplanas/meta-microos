SUMMARY = "Documentation how to use mate-applets"
DESCRIPTION = "This package contains the documentation for mate-applets"
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-applets-doc-1.26.1-1.5.noarch.rpm"
RPM_HASH = "d5058205d0c3f23af214f9c52e5f5f7eaa8f5bf81c2725e252720328f850335176d60dc400e740ebfec0c767996141f297dd0564ad7fafa5f5727e44edfaad02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-applets-doc"

RDEPENDS:${PN} += ""

inherit rpm
