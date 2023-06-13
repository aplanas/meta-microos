SUMMARY = "IPA X-Sampa table for Fcitx"
DESCRIPTION = "Fcitx International Phonetic Alphabet - Extended Speech Assessment Methods Phonetic Alphabet table. \
 \
Notice: It's used to input IPA."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-ipa-x-sampa-0.2.4-2.5.noarch.rpm"
RPM_HASH = "4e61fa226c680787bb888a212e01a4e3c745b2a7985e24b7843e88145ea3e0b094c6e90f8e882d3c08edb2ad3fa2cba464fac5f1588a06a0836c2252b6981934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-ipa-x-sampa \
fcitx-table-other"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
