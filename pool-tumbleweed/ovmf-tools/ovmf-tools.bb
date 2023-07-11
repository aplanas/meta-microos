SUMMARY = "The BaseTools from edk2"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains the tools from edk2."
LICENSE = "BSD-2-Clause-Patent"

PV = "202302"

RPM_NAME = "ovmf-tools-202302-3.1.aarch64.rpm"
RPM_HASH = "8daafe008f61d49f7d6610ac57554407246f7fd4fa06a04d1f375819172c0b7c282b192f68790828bbc8a251bb83ff06d2d0dc0d4d70f50697dfc7339e32ee7d"

RPROVIDES:${PN} += "ovmf-tools"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
