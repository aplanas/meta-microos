SUMMARY = "Quick 3 table for Traditional Chinese"
DESCRIPTION = "Fcitx Quick (Cuk Sing) 3 table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-quick3-0.3.8-2.5.noarch.rpm"
RPM_HASH = "bcea953136a17dcb38987bc830ffdf109bb8b9b4b7e88d62d9b6b0b53db39c05ba54d7fcf8a105fc00110d26c4844bf1df314be107f992a8500e03ec737a51b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-quick3"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
