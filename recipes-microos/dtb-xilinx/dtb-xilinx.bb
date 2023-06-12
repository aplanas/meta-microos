SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-xilinx-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "411f763e96b641a40e0f16c03e1e9f69b007ca7139e79a63c9d0003ba67b1cf0c19afc3aaccde11c6e567efab2255f2fc6afbae2ec6816c7e5134ee666fa926b"

RPROVIDES:${PN} += "dtb-xilinx dtb-xilinx(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
