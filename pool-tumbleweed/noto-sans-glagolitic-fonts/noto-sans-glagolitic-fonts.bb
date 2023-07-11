SUMMARY = "Noto Glagolitic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Glagolitic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-glagolitic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "40aee04f6ef7ba6e11be11877b350bdcc94ec713b8f6c8509fe7f77bab44cac6bebbc28898d554d96664aadea132a53d22bb6fb9a9406ae826af8ab363e64192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-glagolitic \
noto-sans-glagolitic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
