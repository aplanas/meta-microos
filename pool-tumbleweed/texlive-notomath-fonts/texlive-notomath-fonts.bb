SUMMARY = "Severed fonts for texlive-notomath"
DESCRIPTION = "The  separated fonts package for texlive-notomath"
LICENSE = "OFL-1.1"

PV = "2023.201.1.02svn58726"

RPM_NAME = "texlive-notomath-fonts-2023.201.1.02svn58726-54.1.noarch.rpm"
RPM_HASH = "ec86625bed0209a059c2208e2a3dec4751b62be64a292f4f702e658050b9751c7e91cff9e360549fff3345e7cec2738eee771f1f0639a719bf48e6057421d92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(notomath) \
font(notosansmath) \
texlive-notomath-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
