SUMMARY = "Latex table for Fcitx"
DESCRIPTION = "Fcitx Latex table to input Latex formula and symbols."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-latex-0.2.4-2.5.noarch.rpm"
RPM_HASH = "6e1fe548cc633e9690af6ef29cb7d87093124db2edf9d6434a21fc52e76a10f3d426a46e41a2d5e198888c13d9fb919df5a7f61121e022682f38a7235b12756f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-latex \
fcitx-table-other"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
