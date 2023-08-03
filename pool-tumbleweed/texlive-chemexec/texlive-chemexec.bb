SUMMARY = "Creating (chemical) exercise sheets"
DESCRIPTION = "The package provides environments and commands that the author \
needed when preparing exercise sheets and other teaching \
material. In particular, the package supports the creation of \
exercise sheets, with separating printing of solutions"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21632"

RPM_NAME = "texlive-chemexec-2023.209.1.0svn21632-54.1.noarch.rpm"
RPM_HASH = "ba2e969e89b32f7cf53c6f1ae944c4245d902bcd84ab36626d882d80f300995df22eb2ce86393a970dbce909f27eba40de3e55141f5838eb3eb9ac67867787b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemexec.sty \
texlive-chemexec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accents.sty \
tex-amsmath.sty \
tex-calc.sty \
tex-framed.sty \
tex-ifthen.sty \
tex-mhchem.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
