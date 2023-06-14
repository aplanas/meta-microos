SUMMARY = "Bold+Italic Variant of 'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold+Italic variant of 'Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-gothic-bolditalic-fonts-003.02-13.18.noarch.rpm"
RPM_HASH = "b8198de1d9d11aa1d0629b75412646ed329fdae74b2e7d0119116eff4591f5d9fb9c8be07528053cd390b8f7d15b7a87823eefa4c6cff82f0704df29ffa2b71f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic-BoldItalic \
ipa-gothic-bolditalic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
