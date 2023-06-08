SUMMARY = "Development files for dino"
DESCRIPTION = "Contains libraries and header files for developing plugins for dino."
LICENSE = "GPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "dino-devel-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "d08af10f61b4f86056850bb16a5423845c8b0f6d3ad5ea72c562e376369d0c855be1987d6737770bcf3c09ce8de76a11722687bb603189457d2831a2fe5d4efb"

RPROVIDES:${PN} += "dino-devel dino-devel(aarch-64)"
RDEPENDS:${PN} += "dino"

inherit rpm
