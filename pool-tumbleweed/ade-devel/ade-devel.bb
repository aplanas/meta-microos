SUMMARY = "Development files for using ade"
DESCRIPTION = "A graph construction, manipulation, and processing framework. It is suitable \
for organizing data flow processing and execution."
LICENSE = "Apache-2.0"

PV = "0.1.2a"

RPM_NAME = "ade-devel-0.1.2a-1.4.aarch64.rpm"
RPM_HASH = "526a22131271eac36aa6449d13c75f9f7eff5a8151233b9d5e96f7ec631d15218b7f460a0f67fa3f785855bf81244f22434916a70f854add179bc9a91283c8a9"

RPROVIDES:${PN} += "ade-devel"

RDEPENDS:${PN} += ""

inherit rpm
