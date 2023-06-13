SUMMARY = "Italic Variant of 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Italic variant of 'Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-gothic-italic-fonts-003.02-13.18.noarch.rpm"
RPM_HASH = "9c94db70bb20768b6655296eb2c7ec749259005230f47a80b5e76234a8a69cc9f5a81d7f9c0d56b8ea9defeec25504eef9a020304280675e39ce85d31254d0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic_Italic \
ipa-gothic-italic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
