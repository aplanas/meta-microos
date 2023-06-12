SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-mediatek-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "ac022ece360d1426c9fdd69cbbab4c1871b826a37398b1fd72b5b8ecea7c9325ca35af47a1579225a70c7b29932861d5f83eef80a3191d7cdc0f6bd325a641a7"

RPROVIDES:${PN} += "dtb-mediatek dtb-mediatek(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
