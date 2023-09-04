SUMMARY = "Fonts and macros for typesetting go games"
DESCRIPTION = "The macros provide for nothing more complicated than the \
standard 19x19 board; the fonts are written in Metafont."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28628"

RPM_NAME = "texlive-go-2023.209.svn28628-54.2.noarch.rpm"
RPM_HASH = "f4f88e344a60bdf7a0c9a22dd22380d7d8a35a54a094dfeff99b399475901942fdde3a6a17f05825adca765fc8ad5ff19a2998ec96aa20f3a2e7cb9f5a735a85"
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
