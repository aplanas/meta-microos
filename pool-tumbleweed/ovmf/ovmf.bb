SUMMARY = "Open Virtual Machine Firmware"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base."
LICENSE = "BSD-2-Clause-Patent"

PV = "202305"

RPM_NAME = "ovmf-202305-1.1.aarch64.rpm"
RPM_HASH = "b1737fb472bddf2a9b842379e0ba5a0ced7018b076c943d0aaca607680804044cafe9494152aa15b1b215356e15160036598322b1e9139bea9757631db78b056"

RPROVIDES:${PN} += "ovmf"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
