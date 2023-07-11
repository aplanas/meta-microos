SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-xilinx-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "e149b2ebad2a43555f27a5530a7cf0d0c8d0a1840f118c30652357c390f9f8ce563fe7cafebdf6eef39322bd6c9a19c02fa32fb97987ab19dd68572c3b23aa94"

RPROVIDES:${PN} += "dtb-xilinx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
