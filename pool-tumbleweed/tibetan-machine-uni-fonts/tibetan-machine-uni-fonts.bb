SUMMARY = "Font for Tibetan Script"
DESCRIPTION = "The Tibetan & Himalayan Library is pleased to make available the alpha \
release of the Unicode character based Tibetan Machine Uni OpenType font \
for writing Tibetan, Dzongkha and Ladakhi in dbu can script with full \
support for the Sanskrit combinations found in chos skad texts."
LICENSE = "GPL-3.0"

PV = "1.901"

RPM_NAME = "tibetan-machine-uni-fonts-1.901-3.17.noarch.rpm"
RPM_HASH = "65ca123e4b169742622295aa9ea215cd003c1ca3d7bf9a3e62bcfc25eda6fe0c9f0ac9bf38bb839550582b80dcab385b9552018cd76438f5fdd3070819ee6438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tibetan-machine-uni-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
