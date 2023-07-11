SUMMARY = "Open Virtual Machine Firmware"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "ovmf-202302-3.1.aarch64.rpm"
RPM_HASH = "954aadd8560564c42d444bcb89953437863377fdfb07fc2e47ade2ec67fa9cb8fff3b37fde861d01684ed82bc772f8e38c165e7b3691f580af7b16308e7d0dde"

RPROVIDES:${PN} += "ovmf"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
