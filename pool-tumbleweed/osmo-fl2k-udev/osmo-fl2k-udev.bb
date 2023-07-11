SUMMARY = "Udev rules for osmo-fl2k"
DESCRIPTION = "Udev rules for osmo-fl2k."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "osmo-fl2k-udev-0.1.1+git.20200602-1.12.aarch64.rpm"
RPM_HASH = "1c287bcf0b012d9d6e7dea6b16403b3d3b7b8515fa30b8164c95aca0cb51d461489af063aa99ca35f4002c1a24efcbc192e182587b65e9c693ec347e9216a903"

RPROVIDES:${PN} += "osmo-fl2k-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
