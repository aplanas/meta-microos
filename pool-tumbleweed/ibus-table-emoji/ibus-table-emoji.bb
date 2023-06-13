SUMMARY = "Emoji input method for IBus framework"
DESCRIPTION = "ibus-table-emoji provides Emoji input method on IBus Table under IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-emoji-1.3.13-2.3.noarch.rpm"
RPM_HASH = "4395775c84b0f7e826bca94ebd2ef474e02e11820bd1c98c53ff6a31f87dd4a0e8dcc6af6e250063b65b54b1e24bbf734ed2382f7201ce93719afc599a4eef8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-emoji"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
