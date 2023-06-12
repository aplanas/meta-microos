SUMMARY = "Provides dotless i's and j's for use in any math font"
DESCRIPTION = "The package provides two commands: \\dotlessi and \\dotlessj, \
which give access to dotless i's and j's in math mode. They are \
intended for symbols in non English languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51476"

RPM_NAME = "texlive-dotlessi-2023.201.1.1svn51476-52.1.noarch.rpm"
RPM_HASH = "971bf4df397426116fe76f00a38cf5524e018a25dec9db17f46b57906d7530ec9c59dff90c5bf9283ae17086430a3bc1a52eed32598c6d56c4418fdc15e8bd4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dotlessi.sty) \
texlive-dotlessi"
RDEPENDS:${PN} += "/bin/sh \
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
