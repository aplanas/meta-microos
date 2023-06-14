SUMMARY = "A font with the images of the counties of Romania"
DESCRIPTION = "This package provides a Type 1 font with images of the 42 \
counties of Romania, constructed using a general method which \
is described in detail in the documentation. The package name \
is an abbreviation of 'judetele Romaniei' (= counties of \
Romania)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn56895"

RPM_NAME = "texlive-rojud-2023.201.1.2svn56895-53.1.noarch.rpm"
RPM_HASH = "2e28a52048590929571f149bada760c65ec72f3412376804bb5a6b47b933b9d4fb57c29c10dde28404aa78b1895c446524c4999e36ee667011e60fe3cf78baa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1rojud.fd \
tex-rojud.map \
tex-rojud.sty \
tex-rojud.tfm \
tex-turojud.fd \
texlive-rojud"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rojud-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
