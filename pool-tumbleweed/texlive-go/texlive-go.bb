SUMMARY = "Fonts and macros for typesetting go games"
DESCRIPTION = "The macros provide for nothing more complicated than the \
standard 19x19 board; the fonts are written in Metafont."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28628"

RPM_NAME = "texlive-go-2023.209.svn28628-54.1.noarch.rpm"
RPM_HASH = "e9e14e0dc99c775092fff4b028df0456fdf9836ca1084b7ca1adc21069ba106d10505e17fef7f2f16fdcf12fd2f1773e5866f175464df03cb9d7f5c4cb515dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-go.sty \
tex-go10.tfm \
tex-go15.tfm \
tex-go1bla10.tfm \
tex-go1bla15.tfm \
tex-go1bla20.tfm \
tex-go1whi10.tfm \
tex-go1whi15.tfm \
tex-go1whi20.tfm \
tex-go20.tfm \
tex-go2bla10.tfm \
tex-go2bla15.tfm \
tex-go2bla20.tfm \
tex-go2whi10.tfm \
tex-go2whi15.tfm \
tex-go2whi20.tfm \
tex-gosign50.tfm \
texlive-go"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
