SUMMARY = "Severed fonts for texlive-ibygrk"
DESCRIPTION = "The  separated fonts package for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.4.5svn15878"

RPM_NAME = "texlive-ibygrk-fonts-2023.208.4.5svn15878-53.1.noarch.rpm"
RPM_HASH = "f8f834e6765bd31ebbe64bc46e13fa30afd9c5828e18ba77217988d4af5a123334688300ae5844fab0c2c885f11f825470eb795d84f0bcfdb09f6b91f7ed3753"
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
