SUMMARY = "Array 30 table for Traditional Chinese"
DESCRIPTION = "Fcitx Array 30 (hang laat 30) table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-array30-0.3.8-2.5.noarch.rpm"
RPM_HASH = "f71723b72d4ada7f792787bd3315b8ac9aec96ff6963b9b46d17cae31de764caf807f293a0429b9581aa081d2eea88ddd366c5f7f8aa7cb8ad0c548739dab5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-array30"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
