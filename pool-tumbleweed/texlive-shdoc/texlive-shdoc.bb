SUMMARY = "Float environment to document the shell commands of a terminal session"
DESCRIPTION = "The package provides a simple, though fancy float environment \
to document terminal sessions -- like command executions or \
shell operations. The look and feel of the package output \
imitates the look of a shell prompt."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1bsvn41991"

RPM_NAME = "texlive-shdoc-2023.201.2.1bsvn41991-53.1.noarch.rpm"
RPM_HASH = "3b93db47d82cff452b8e3eb195e44b4b1e14d3d5d35fc50a52b2b055909ee86d676102d0267bac8756b4df93f6957fde992f31939d8b0fc38db90f3209555781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shdoc.sty \
texlive-shdoc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-float.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-mdframed.sty \
tex-relsize.sty \
tex-stringstrings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
