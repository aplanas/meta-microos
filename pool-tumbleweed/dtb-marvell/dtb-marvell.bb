SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-marvell-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "bb44fcfc5a56aca6ca1062e7740c102f132c56cb0eb7686756c5621b3684d9b2deeab50debee1428c3b1f46d2ecfe242be3d1e094f97c43b7325f78e7e378322"

RPROVIDES:${PN} += "dtb-marvell \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
