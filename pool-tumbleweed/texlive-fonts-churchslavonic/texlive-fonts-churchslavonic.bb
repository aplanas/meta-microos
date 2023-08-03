SUMMARY = "Fonts for typesetting in Church Slavonic language"
DESCRIPTION = "The package provides Unicode-encoded OpenType fonts for Church \
Slavonic which are intended for Unicode TeX engines only."
LICENSE = "OFL-1.1"

PV = "2023.209.2.2svn56350"

RPM_NAME = "texlive-fonts-churchslavonic-2023.209.2.2svn56350-53.1.noarch.rpm"
RPM_HASH = "b71190aef6976abba2c7f5f4872a775f5b08f299506382bab8fe1f2718cc85551cea93ac9889f146883fdc9dc8bbf655afc9ac5261f8f8beef91da512f6ff5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-churchslavonic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-fonts-churchslavonic-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
