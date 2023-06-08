SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-amlogic-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "198a0fa0237c014a64bc0006fca35a8fcbec7f12b9211a796397a2009cf46150f4f8bc04b10f8e1bf8c04efc5461202ec1b3f89e12a6937a50b8d60d3c05efb6"

RPROVIDES:${PN} += "dtb-amlogic dtb-amlogic(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
