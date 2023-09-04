SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-nvidia-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "0cd2c126c383cc767f647d8bae5e88de4188fc448a9a3cba61423eefa800c389a154cd1b9da7a92a2d03762197581265f16e7f982997d98e8c6afd5af4a38cd1"

RPROVIDES:${PN} += "dtb-nvidia \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
