SUMMARY = "Documentation for qt6-quick3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c91b38e32a2b2b4933082ab835be4ee0a263768da6502fed1b6bf370a16c61ca7a0f322c2b5a2247a638a50f327c66c0ed1fdac6a4d50563780c02406230553e"

RPROVIDES:${PN} += "qt6-quick3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
