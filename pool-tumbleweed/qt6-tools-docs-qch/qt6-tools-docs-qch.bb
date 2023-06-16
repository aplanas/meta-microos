SUMMARY = "Documentation for qt6-tools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-tools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-tools-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "258de8d0f27a671b6da733c41046b66cd9090014afaf3bf670c87bae6dec51cf7a3eb83f74a353ae329db2e165259bcb73892d5b56794369294dfdf32ca273f0"

RPROVIDES:${PN} += "qt6-tools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
