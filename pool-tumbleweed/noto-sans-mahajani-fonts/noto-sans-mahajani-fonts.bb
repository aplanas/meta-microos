SUMMARY = "Noto Mahajani Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mahajani Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mahajani-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "fb676f35844a8dd3d21d9f2d2dbe42b8a03d4d4117df022a69c31c9b196893e2f4dd32352df5321c5e1f1820f7a251753b3c5a1247290ac3501c7f9876d6a18f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mahajani \
noto-sans-mahajani-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
