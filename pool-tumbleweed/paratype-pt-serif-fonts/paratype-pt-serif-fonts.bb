SUMMARY = "Serif Fonts for Minority Languages of Russia"
DESCRIPTION = "PT Serif is a transitional serif face with humanistic terminals designed \
for use together with PT Sans and harmonized with PT Sans on metrics, \
proportions, weights and design. PT Serif consists of six styles: \
regular and bold weights with corresponding italics form a standard \
computer font family for basic text setting; two caption styles (regular \
and italic) are for texts of small point sizes. \
 \
The fonts beside standard Western, Central European and Cyrillic code \
pages contain characters of all title languages of Russian Federation \
that make them unique and very important tool of the modern digital \
communications."
LICENSE = "OFL-1.1"

PV = "1.002OFL"

RPM_NAME = "paratype-pt-serif-fonts-1.002OFL-3.17.noarch.rpm"
RPM_HASH = "c64ca04dc8457676c610cebe72ab099cc96edabdcc81f3d638d9c2265a2351ffb77df37e6efbbeb82c3877473f6c3dcddc3278a1810964ba3359f670959f01ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PTSerif-fonts \
locale(be;ru;uk) \
paratype-pt-serif-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
