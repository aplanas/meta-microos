SUMMARY = "Unicode Font by /efont/"
DESCRIPTION = "Unicode fonts developed by /efont/ openlab. This font package includes \
12,14, 16, and 24 pixel ISO-10646 fonts."
LICENSE = "SUSE-Public-Domain & BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "efont-unicode-bitmap-fonts-0.4.2-228.10.noarch.rpm"
RPM_HASH = "ebca0184de5613cf5722f556e6edf4f27848d3604d478eb59bae5943497c527cc9aa8b3df85a6710327462d67f2f5fb79c35a74b2b3ac0da9ef015dc88888121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "efont-unicode \
efont-unicode-bitmap-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
mkfontdir \
perl"

inherit rpm
