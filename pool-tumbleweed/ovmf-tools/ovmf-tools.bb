SUMMARY = "The BaseTools from edk2"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains the tools from edk2."
LICENSE = "BSD-2-Clause-Patent"

PV = "202305"

RPM_NAME = "ovmf-tools-202305-1.1.aarch64.rpm"
RPM_HASH = "5b793a0bac15a207c26084718c7b00e5f8a2083566e4f6d6957282d124c6b32dc9569d29956910e8ee31ffb22257a424bda95aa58851cc34a3c218d3acb8989a"

RPROVIDES:${PN} += "ovmf-tools"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
