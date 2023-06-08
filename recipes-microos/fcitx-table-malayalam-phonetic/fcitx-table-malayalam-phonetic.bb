SUMMARY = "Malayalam Phonetic table for Fcitx"
DESCRIPTION = "Fcitx Malayalam Phonetic table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-malayalam-phonetic-0.2.4-2.5.noarch.rpm"
RPM_HASH = "fcad69f2a059b9928ba006dae5a8cdeebc0eb8a0a467786dff4200e985b268301cc8e1a3d5f56a8c343cd4c5a3e94313af0014c264adfcb67eaab795bdae8f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-malayalam-phonetic fcitx-table-other"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
