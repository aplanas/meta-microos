SUMMARY = "Ukrainian Translit table for Fcitx"
DESCRIPTION = "Fcitx Ukrainian Translit table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-ua-translit-0.2.4-2.5.noarch.rpm"
RPM_HASH = "d0839b29e4b018fa7b6a6e6fabf7f4132d9de205e41ff2ff2c542d3a88e9e6f00c39ab30b9bad0ea592266687f3cb306acb0ccecc2c5b2d0ef5ccbf1eca707c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other fcitx-table-ua-translit"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
