SUMMARY = "Noto Old Sogdian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldSogdian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldsogdian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c34df25ca8e74ba1bd11bd3071af34e3372fbc2a08cec4102a2937ff16456c2a770209fe00c3631881145ea769c448d959441f5161915909c53682f6aea5cfb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldsogdian \
noto-sans-oldsogdian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
