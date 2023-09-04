SUMMARY = "Severed fonts for texlive-ibygrk"
DESCRIPTION = "The  separated fonts package for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.5svn15878"

RPM_NAME = "texlive-ibygrk-fonts-2023.209.4.5svn15878-54.1.noarch.rpm"
RPM_HASH = "f0b40f52cdd3da06fab7eb789cb97d87f020d177a6454ef80553e7273952b21aa4f0f39b75e913e1ad4f33d111b70adf4988861a86db86c5b58684e269024499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-ibycushtgpolytonicgreek \
texlive-ibygrk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
