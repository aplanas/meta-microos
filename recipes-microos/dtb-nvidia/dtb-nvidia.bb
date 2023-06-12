SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-nvidia-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "bcac50607bffd5351a381d25d827a2d1a989b5b5236547c163b7ae4024026cf58debdb0fb396a16081430545ad08c6ff31b1935e1aa6f0d981f486298d1c9ed9"

RPROVIDES:${PN} += "dtb-nvidia dtb-nvidia(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
