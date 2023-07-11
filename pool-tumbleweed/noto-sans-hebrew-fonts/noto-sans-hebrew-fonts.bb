SUMMARY = "Noto Hebrew Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hebrew Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hebrew-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2b0d7b001ab800da9442a87f0adb49e64cb8a61b92d27270046d112ce9523da914a4f3f6d5de3d68c42af532f72e76811897ac705e618d8dae0eaf0fc27bd249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hebrew \
noto-sans-hebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
