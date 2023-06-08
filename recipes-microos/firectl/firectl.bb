SUMMARY = "Command-line tool to run Firecracker microVMs"
DESCRIPTION = "Firectl is a command-line tool to run Firecracker microVMs."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "firectl-0.2.0-1.3.aarch64.rpm"
RPM_HASH = "b14f2e821887dcda6370d7c78a7d3d14ab5b2630457ad7650271f57dda6d3f99c5c71a0dd4991feaf9e34072205c42fa1ab5fc035e13224862a0414369a346f6"

RPROVIDES:${PN} += "firectl firectl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
