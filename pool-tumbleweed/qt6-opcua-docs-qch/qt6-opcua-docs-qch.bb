SUMMARY = "Documentation for qt6-opcua in QCH format"
DESCRIPTION = "This package contains documentation for qt6-opcua in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-opcua-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "705600e17afb8b70b05e790dd8a7f524c5774c923eeb6c4fa318158101426881f13d1bb0bfa0128c285889fa0c7a19895f676a7a21ce4f03f342e5777434bcce"

RPROVIDES:${PN} += "qt6-opcua-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
