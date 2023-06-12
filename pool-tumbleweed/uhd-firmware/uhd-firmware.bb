SUMMARY = "Firmware images for uhd"
DESCRIPTION = "This package contains binary firmware images for the Universal Hardware Driver (UHD)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-firmware-4.4.0.0-1.4.noarch.rpm"
RPM_HASH = "2edf08af3f2756b5f6902dd59d3447e5ca68f0007c953d5d2ccf4cf8fb02386e7f1681d007300406de7dd3feaccabb6e52f0c2159b8feef438a029115c0535d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uhd-firmware"
RDEPENDS:${PN} += "libuhd4_4_0"

inherit rpm
