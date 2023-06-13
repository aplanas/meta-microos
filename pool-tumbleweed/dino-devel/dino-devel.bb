SUMMARY = "Development files for dino"
DESCRIPTION = "Contains libraries and header files for developing plugins for dino."
LICENSE = "GPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "dino-devel-0.4.2-1.2.aarch64.rpm"
RPM_HASH = "bdf3661013345543b5c8b2ae5dcccbb0225c89a8299b5c68e4bf4faf1f04223ddba3dff5c85f9909793280251ba0b0ff111e39064ac8aac2ffb7478e05d4560d"

RPROVIDES:${PN} += "dino-devel \
dino-devel(aarch-64)"

RDEPENDS:${PN} += "dino"

inherit rpm
