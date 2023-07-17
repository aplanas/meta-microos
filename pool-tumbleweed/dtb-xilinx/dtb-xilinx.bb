SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-xilinx-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "c560d452ab0df34a7ef5807e85fddb93fb123e95f2d7a1b25a8fdf68d4329f0f4c1a58f2094e054b25c0adbe27a153f0eac43f3f5da1c57886a4f4edacc804fd"

RPROVIDES:${PN} += "dtb-xilinx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
