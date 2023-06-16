SUMMARY = "Fonts and macros for typesetting go games"
DESCRIPTION = "The macros provide for nothing more complicated than the \
standard 19x19 board; the fonts are written in Metafont."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28628"

RPM_NAME = "texlive-go-2023.201.svn28628-53.1.noarch.rpm"
RPM_HASH = "dab452aa47617eb91773062528a968425262b574098b552f3547a63ea719191ca34a14336eac5a32e35870d1ba124a432e300863ff6dfe1a8ed5ffd168d949ba"
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
