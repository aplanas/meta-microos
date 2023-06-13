SUMMARY = "Array 30 table with large character set for Traditional Chinese"
DESCRIPTION = "Fcitx Array 30 (hang laat 30) table with large character set \
for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-array30-large-0.3.8-2.5.noarch.rpm"
RPM_HASH = "dc6907696e5a629e795ed351013e2dcf8b32d5af5b07ac45397dce1d9d5e4eaddcacedd50e6ad83dd243e3679f0f6347645954e40438d36a07727ceb3a4940d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-array30-large"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
