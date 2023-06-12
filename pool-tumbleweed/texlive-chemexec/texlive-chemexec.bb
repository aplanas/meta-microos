SUMMARY = "Creating (chemical) exercise sheets"
DESCRIPTION = "The package provides environments and commands that the author \
needed when preparing exercise sheets and other teaching \
material. In particular, the package supports the creation of \
exercise sheets, with separating printing of solutions"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21632"

RPM_NAME = "texlive-chemexec-2023.201.1.0svn21632-53.1.noarch.rpm"
RPM_HASH = "7601395d781d93483de014d8cd510f0624cf45ccbc60d9be4bc7dfe5471089e3b654b31c7b316394c7869957f9aef9d6b848a1c78ae232fde133ec90a565a86d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemexec.sty) \
texlive-chemexec"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(accents.sty) \
tex(amsmath.sty) \
tex(calc.sty) \
tex(framed.sty) \
tex(ifthen.sty) \
tex(mhchem.sty) \
tex(tikz.sty) \
tex(ulem.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
