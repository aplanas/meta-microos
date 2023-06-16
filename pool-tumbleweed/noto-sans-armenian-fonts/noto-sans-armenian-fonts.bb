SUMMARY = "Noto Armenian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Armenian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-armenian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1e5f73db87b51a67c6175717562fb6956bfa9f0a75c346d4a6217b988b5226cc677c2819a99780c5b7c473200cf9d8308736f7cdadd75d6709021e782b72c27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-armenian \
noto-sans-armenian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
