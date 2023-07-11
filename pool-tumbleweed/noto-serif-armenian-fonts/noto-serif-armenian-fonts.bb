SUMMARY = "Noto Armenian Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Armenian Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-armenian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9f27bd67a181eae257f197f0babc346820e4da7f46ebc2981229e2bb5698dc7409afa73620e6e5a042810a4dc0c8dfb5f0f39336acc94d9a119ff3f52deb4456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-armenian \
noto-serif-armenian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
