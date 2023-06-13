SUMMARY = "The BaseTools from edk2"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains the tools from edk2."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "ovmf-tools-202302-2.2.aarch64.rpm"
RPM_HASH = "84f27b1667370423bb6774ef891e5a9cc33fc4cf5698562cde03b3b5127e66bad2628ea27afa7af2f9f85b3e53b4d85b2f5945911eeaf4a4395120432812b2f7"

RPROVIDES:${PN} += "ovmf-tools \
ovmf-tools(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
