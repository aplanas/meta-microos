SUMMARY = "'Mincho' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Mincho' Japanese TrueType font made by IPA (Information-technology \
Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-mincho-fonts-003.03-8.15.noarch.rpm"
RPM_HASH = "36e88428894feeda6791511165aaac101fbf3c0b4a15be7b195539ecee9a1c0c37af906c6bf4439ded71d054b6507c610cd23b481c97f8569c2b24282c0e696c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAMincho \
ipa-mincho-fonts \
locale(ja) \
scalable-font-ja"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
