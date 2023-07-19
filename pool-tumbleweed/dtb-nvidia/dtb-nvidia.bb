SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-nvidia-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "e433eaa0ce61e79048cf7503f4e8ce64e9a974f1e736885db18578a420010baaa4c034be867afdcaae1f13b3e20a76fad0e35ec3d74f46b651844d61b2fbbb53"

RPROVIDES:${PN} += "dtb-nvidia \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
