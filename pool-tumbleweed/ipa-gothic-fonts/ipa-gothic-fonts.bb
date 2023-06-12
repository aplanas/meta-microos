SUMMARY = "'Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Gothic' Japanese TrueType font made by IPA (Information-technology \
Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-gothic-fonts-003.03-8.15.noarch.rpm"
RPM_HASH = "f0a1b7ae6cf69e47b4604ceae4f437287f72fe542c296f346d66806d5b23844931f82143f5c4d97cfe4c2ac13f4fc77d18a441dc3d701a45d391650f85df8fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAGothic \
ipa-gothic-fonts \
locale(ja) \
scalable-font-ja"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
