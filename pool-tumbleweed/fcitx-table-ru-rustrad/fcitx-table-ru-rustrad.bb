SUMMARY = "Traditional Russian table for Fcitx"
DESCRIPTION = "Fcitx Traditional Russian table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-ru-rustrad-0.2.4-2.5.noarch.rpm"
RPM_HASH = "8e2640af51ffc2ab47d659e85d5536df64d960bc156381bbc3c81055a7460ce880db60fa5b1c188b6f48c0f1f624b716dd657558cb13830625707b25403133f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other \
fcitx-table-ru-rustrad"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
