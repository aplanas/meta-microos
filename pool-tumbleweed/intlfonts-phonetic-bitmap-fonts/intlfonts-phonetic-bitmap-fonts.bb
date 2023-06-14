SUMMARY = "IPA font for the X Window System"
DESCRIPTION = "The International Phonetic Alphabet font for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-phonetic-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "4d9296c23db5ff3dbd6e74a1896330a7088e1cb0fd220613173149ff28f6f44e2cff4602a7f5635b09309c4cef8b5c6d6248b2ab8fd3e9fe67b36acd7a0d1db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntphon \
intlfonts-phonetic-bitmap-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
