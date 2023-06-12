SUMMARY = "Quick Classic table for Traditional Chinese"
DESCRIPTION = "Fcitx Quick (Cuk Sing) Classic table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-quick-classic-0.3.8-2.5.noarch.rpm"
RPM_HASH = "97995378798d1b7602fa6850ff5f96bc22a5d4901dfcf272c5c3cecb0a07e8b3d25b48648c9625882a86525cd4c6fca3920797b8f3bee514eb40770befdac011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-quick-classic"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
