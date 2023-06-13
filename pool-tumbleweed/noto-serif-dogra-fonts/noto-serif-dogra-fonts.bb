SUMMARY = "Noto Dogra Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Dogra Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-dogra-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "56e86871a8ea9e3c4a330322e44a29c12381c0077485a40b178250c22e66adb0b896222e3f0a345bbc170d8d2daefbcebb49fd5edcbbfe0c58f57defcb1c50fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-dogra \
noto-serif-dogra-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
