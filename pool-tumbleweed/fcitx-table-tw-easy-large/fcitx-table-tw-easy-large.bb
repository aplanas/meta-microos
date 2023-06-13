SUMMARY = "Easy table with large character set for Traditional Chinese"
DESCRIPTION = "Fcitx Easy (Heng Sung) table with large character set \
for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-easy-large-0.3.8-2.5.noarch.rpm"
RPM_HASH = "44faa91125c0803150aed2c4f63b1c1897f3eb2f213f575fef204ad73eb93722be312b1f8882939f01b8779180179152cd4c8c8b8a23eda0d93892dc766e273c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-easy-large"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
