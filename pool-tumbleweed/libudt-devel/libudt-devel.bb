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

RPM_NAME = "libudt-devel-4.11-1.23.aarch64.rpm"
RPM_HASH = "69c2cfc8028ab2946593eee7ff3c89ad64c84efe7789e5de5dc842b4bf8fd31928eb4694fb7e24af9a6df3233b7f0b861d971ad811b483405fa43a3decf97081"

RPROVIDES:${PN} += "libudt-devel \
udt-devel"

RDEPENDS:${PN} += "libudt0"

inherit rpm
