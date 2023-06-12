SUMMARY = "Documentation how to Use Atril"
DESCRIPTION = "This package contains the documentation for atril"
LICENSE = "GPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "mate-power-manager-doc-1.26.1-1.1.noarch.rpm"
RPM_HASH = "444e01514548b12e6d5a97bbf2927e0c0d669d8e3d9e2e05d8029b209f1c9c370c1630e96df416cf8fb340cdfcbedf5538c6ff1e4fc4d4526e1029c5a0181d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-power-manager-doc"
RDEPENDS:${PN} += ""

inherit rpm
