SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-nvidia-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "34c697e9b65380a1eca9dd73e16a0325601d711d2facb28c803b633637c545ae06f2f78fcba93b276682bf81a892d1af6327045f5c2487318a454072e255b4d4"

RPROVIDES:${PN} += "dtb-nvidia \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
