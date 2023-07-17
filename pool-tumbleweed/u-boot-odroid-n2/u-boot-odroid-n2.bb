SUMMARY = "The U-Boot firmware for the odroid-n2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-n2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-odroid-n2-2023.07-1.1.aarch64.rpm"
RPM_HASH = "7ea03456ca2ce22773e9840a62ed14f4a29af93fc9ab3715b05085c4da1a577544f4ae2425e26909d3a892214b40824b9a5aa504b13105a65c10dff2643e2c1d"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-n2"

RDEPENDS:${PN} += ""

inherit rpm
