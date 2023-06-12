SUMMARY = "Amiri is a body text Naskh typeface"
DESCRIPTION = "Amiri is a classical Arabic typeface in Naskh style for typesetting \
books and other running text. Amiri is a revival of the beautiful typeface \
pioneered in early 20th century by Bulaq Press in Cairo, also known as \
Amiria Press, after which the font is named. Amiri project aims at the \
revival of the aesthetics and traditions of Arabic typesetting, and adapting \
it to the era of digital typesetting, in a publicly available form."
LICENSE = "OFL-1.1"

PV = "1.000"

RPM_NAME = "aliftype-amiri-fonts-1.000-1.2.noarch.rpm"
RPM_HASH = "d5d1740dd96dc4ecc263ba616e93e4a036fd7552c137e78246369b40f28a744f12d556efcedf53e7c0f22aac23110ada404b024ddf5ab74d14bcee7b04e780b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aliftype-amiri-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
