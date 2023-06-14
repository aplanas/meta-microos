SUMMARY = "Bold Variant of 'Proportional Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "Bold variant of 'Proportional Gothic' Japanese TrueType font made by IPA \
(Information-technology Promotion Agency)."
LICENSE = "IPA"

PV = "003.02"

RPM_NAME = "ipa-pgothic-bold-fonts-003.02-13.18.noarch.rpm"
RPM_HASH = "3df014c865613f94c0068c29c088b86ddfb20aced2597afd6e23b2985719c5088bab10971cc0c50866b327d9030ff3ee15ce8b6875db12814ff80da41554362c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAPGothic-Bold \
ipa-pgothic-bold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
