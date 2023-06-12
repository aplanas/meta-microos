SUMMARY = "Japanese Fonts for the X Window System"
DESCRIPTION = "Japanese fonts for the X Window System."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "intlfonts-japanese-bitmap-fonts-1.2.1-16.15.noarch.rpm"
RPM_HASH = "c53164e33e22633b9fee0ad1731ab19598e33fc5f0ed1573a873fbd17b18df1a523a28fec15c08caa584d704feccef558fc971302a0acff6a7a778857b1b05df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ifntjapa \
intlfonts-japanese-bitmap-fonts \
locale(xorg-x11:ja)"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
