SUMMARY = "Development files for boxfort"
DESCRIPTION = "Development files for boxfort."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "boxfort-devel-0.1.4-1.4.aarch64.rpm"
RPM_HASH = "e9b64b8d03ca79cb85333e53509f08763b751345b4594cf4b2e7493905fc5fd6487bd83f83573dd0ad7cb98568ab3907d8ad2b908f8159fb370ab3ee759e2398"

RPROVIDES:${PN} += "boxfort-devel \
pkgconfig-boxfort"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boxfort"

inherit rpm
