SUMMARY = "'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.03"

RPM_NAME = "ipa-pgothic-fonts-003.03-8.15.noarch.rpm"
RPM_HASH = "b730219c669ed4a1fd6e296067b14459e345a3a40e881f229aae6e8b44fdb438cf61025f16d3371d18f6f0bcf0e5c0cddf6b105cd28255619e6371e343650446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic \
ipa-pgothic-fonts \
locale(ja) \
scalable-font-ja"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
