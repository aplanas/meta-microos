SUMMARY = "Quick 5 table for Traditional Chinese"
DESCRIPTION = "Fcitx Quick (Cuk Sing) 5 table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-quick5-0.3.8-2.5.noarch.rpm"
RPM_HASH = "c3a19feedeef8350c92c78d92ca9bc99f74e42714a3e45b5d97f8d18dae4c65093d76b54dad9bbad0ee8ebf9e19d11a64246518e7118a48d868d535b395e28af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra fcitx-table-tw-quick5"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
