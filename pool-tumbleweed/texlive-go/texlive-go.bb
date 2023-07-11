SUMMARY = "Fonts and macros for typesetting go games"
DESCRIPTION = "The macros provide for nothing more complicated than the \
standard 19x19 board; the fonts are written in Metafont."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28628"

RPM_NAME = "texlive-go-2023.201.svn28628-53.2.noarch.rpm"
RPM_HASH = "38641ad0a54b8cbc388d7ae8b93308c4216f620a4913cbb00ce110903dcccc9e9a0a754e70fb5f09308e4f3866d88b7552928955f3c5c58f90a713d40965f795"
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
