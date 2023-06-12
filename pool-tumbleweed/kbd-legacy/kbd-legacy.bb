SUMMARY = "Legacy data for kbd package"
DESCRIPTION = "The kbd-legacy package contains original keymaps for kbd package. \
Please note that kbd-legacy is not helpful without kbd."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.1"

RPM_NAME = "kbd-legacy-2.5.1-1.3.noarch.rpm"
RPM_HASH = "cbdf16b54c9dbc13ea6b37a1494a60f11691ba9912c337627e186c0c9f5fdeec95d1f8f6c2b4754936deaff2f67d724c0dfa34ff66c88973424a2cc1bb5912b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbd-legacy"
RDEPENDS:${PN} += ""

inherit rpm
