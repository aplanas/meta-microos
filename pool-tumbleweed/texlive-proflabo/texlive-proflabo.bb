SUMMARY = "Draw laboratory equipment"
DESCRIPTION = "This package was developed to help French chemistry teachers to \
create drawings (using TikZ) for laboratory stuff."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63147"

RPM_NAME = "texlive-proflabo-2023.209.1.0svn63147-53.1.noarch.rpm"
RPM_HASH = "5ba6240dcde22936a29b3a7668be01e1b41b64986ff9a46a5bf14fcc6f9c4494e9fac607f2ea0087c2ee0d05f8ccaa006390975675b6bec0e1b7fc800284756e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProfLabo.sty \
texlive-proflabo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-pgf.sty \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
