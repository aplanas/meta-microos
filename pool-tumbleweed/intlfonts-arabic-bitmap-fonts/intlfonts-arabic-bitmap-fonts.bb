SUMMARY = "Arabic Fonts for the X Window System"
DESCRIPTION = "Arabic fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-arabic-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "eb445542c8fa211797b613532776325dc0e69fed3d965b76789e408b02b0b40c955e930e449f1c6d6d2492dab11c45d5999be6b592e0ca9483824d308dc4ef1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntarab \
intlfonts-arabic-bitmap-fonts \
locale-xorg-x11-ar"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
