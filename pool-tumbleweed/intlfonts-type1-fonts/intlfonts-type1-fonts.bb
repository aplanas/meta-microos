SUMMARY = "Type1 Fonts from the GNU Intlfonts Package"
DESCRIPTION = "Type1 fonts from the GNU intlfonts package."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-type1-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "b5e4996e2aa31f5067459d187e83cba70f15bfafda442fe9257f4629fc1fb8864bb2a03b0f420deee7bfa7d0590dbded8b42a59c8aabcbe65df6d2d848ecfcbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intlfonts-type1-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
