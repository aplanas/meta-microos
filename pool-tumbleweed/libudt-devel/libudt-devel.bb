SUMMARY = "Development files for the UDP-based Data Transfer Protocol library"
DESCRIPTION = "UDT is a reliable UDP-based application level data transport protocol \
for distributed data intensive applications over wide area high-speed \
networks. UDT uses UDP to transfer bulk data with its own reliability \
control and congestion control mechanisms. The new protocol can \
transfer data at a much higher speed than TCP does. UDT is also a \
highly configurable framework that can accommodate various congestion \
control algorithms. \
 \
This package provides the files for developing applications to use UDT."
LICENSE = "BSD-3-Clause"

PV = "4.11"

RPM_NAME = "libudt-devel-4.11-1.22.aarch64.rpm"
RPM_HASH = "266a5bcad202df19c6833081042313020841a83d9cdec7281261c425607ffd1cca56a2dcc93d3dbc28449fc4c6906557057888a259e789db4a05307179ad47c4"

RPROVIDES:${PN} += "libudt-devel \
libudt-devel(aarch-64) \
udt-devel"

RDEPENDS:${PN} += "libudt0"

inherit rpm
