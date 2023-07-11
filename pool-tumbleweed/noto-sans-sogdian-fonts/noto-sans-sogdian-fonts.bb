SUMMARY = "Noto Sogdian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sogdian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sogdian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "06a0957596edb6ddef2ca70e82f789b46d64cb62728c0ecd10b3ef71b4677c554b12472e7f05bce69ee2b8b076239841dbb222a4a1b5bca5adf07963f5947402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sogdian \
noto-sans-sogdian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
