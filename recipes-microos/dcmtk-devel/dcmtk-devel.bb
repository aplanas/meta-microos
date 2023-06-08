SUMMARY = "Development files for dcmtk"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using dcmtk."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "dcmtk-devel-3.6.7-1.9.aarch64.rpm"
RPM_HASH = "508ec978f04f7ecfb4a68c58b92a5e85a271117edd099e023ecd37ee8249048e7246fbffff7f588a72165c747ce5c33b5e512a6b52f89a6c77df37f27a7be3c4"

RPROVIDES:${PN} += "cmake(DCMTK) dcmtk-devel dcmtk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdcmtk17 tcpd-devel"

inherit rpm
