SUMMARY = "Noto Lydian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lydian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lydian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2ec4f8e1a8ca61b3ce26e0aa398789855d92390c7ac89f510d85119bb2ce5ac6a20b697e0cf60f738aaeeecc2265c6a93da890b1d7709138e6df1d283d972e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lydian \
noto-sans-lydian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
