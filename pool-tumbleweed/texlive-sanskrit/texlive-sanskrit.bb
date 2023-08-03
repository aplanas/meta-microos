SUMMARY = "Sanskrit support"
DESCRIPTION = "A font and pre-processor suitable for the production of \
documents written in Sanskrit. Type 1 versions of the fonts are \
available."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.4svn64502"

RPM_NAME = "texlive-sanskrit-2023.209.2.2.4svn64502-54.1.noarch.rpm"
RPM_HASH = "3395d6d20c14b5ec71891e8dd2361a3fabf12eb483551f53b7b6a047a5d6978089084e396105875b92e8db3da686955b45c79bf8ebced304ba5afa3a49e366f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1skt.fd \
tex-skt.sty \
tex-skt10.tfm \
tex-skt8.tfm \
tex-skt9.tfm \
tex-sktb10.tfm \
tex-sktbs10.tfm \
tex-sktf10.tfm \
tex-sktfs10.tfm \
tex-skts10.tfm \
texlive-sanskrit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
