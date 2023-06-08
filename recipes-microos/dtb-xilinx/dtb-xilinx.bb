SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-xilinx-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "d699fd4b966c357ba750bf8d50cbb423bedcf0bd413a431d2fd8e9e36634cc26e761e81ed11de281ef2abaa2e0d450bdec2f5092002d63a05e0246369edd1a48"

RPROVIDES:${PN} += "dtb-xilinx dtb-xilinx(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
