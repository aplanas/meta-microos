SUMMARY = "Italic Variant of 'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Italic variant of 'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-pgothic-italic-fonts-003.02-13.18.noarch.rpm"
RPM_HASH = "fa4b4f694e4153519fbcd40964cf008f66a0b8f4a5ab518c8b163eb042dafe3d4c6a3d84200684833b779143001a67bbf7b19222d8d510e9fb7530a1fa45d867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic-Italic \
ipa-pgothic-italic-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
