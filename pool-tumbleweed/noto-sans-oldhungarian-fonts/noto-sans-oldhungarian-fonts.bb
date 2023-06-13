SUMMARY = "Noto Old Hungarian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldHungarian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldhungarian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "33bfb962a4756c9052a4a13d86710ece3be7a0bc7e9de571030c8caa2a26bd6e610e7ba7aa09b5fec10f73d4e1e780b6ac561a90caaa55d04fd55cac1071f20a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldhungarian \
noto-sans-oldhungarian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
