SUMMARY = "Development files for dino"
DESCRIPTION = "Contains libraries and header files for developing plugins for dino."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "dino-devel-0.4.3-1.1.aarch64.rpm"
RPM_HASH = "26d1a775b5f2421ecf85d4a5ac6720839d52154c4f5853649ff6087117450158dd825e60a50efb19f9e1e3988128c88553fda23d16d7186ece468c5cb041bb35"

RPROVIDES:${PN} += "dino-devel"

RDEPENDS:${PN} += "dino"

inherit rpm
