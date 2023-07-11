SUMMARY = "Fullscreen game browser for FS-UAE"
DESCRIPTION = "FS-UAE Arcade is a fullscreen Amiga game browser for FS-UAE."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.63"

RPM_NAME = "fs-uae-arcade-3.1.63-1.10.noarch.rpm"
RPM_HASH = "8d195defed3914143919df992ce104d415c61095514221a93f27836ec7c175eb38abce7a04019ab987730e5ca8793c378ea06e92749be1950b90e686c4497179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fs-uae-arcade"

RDEPENDS:${PN} += "/usr/bin/python3 \
fs-uae \
python3-opengl \
python3-qt5 \
python3-requests"

inherit rpm
