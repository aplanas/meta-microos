SUMMARY = "Float environment to document the shell commands of a terminal session"
DESCRIPTION = "The package provides a simple, though fancy float environment \
to document terminal sessions -- like command executions or \
shell operations. The look and feel of the package output \
imitates the look of a shell prompt."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1bsvn41991"

RPM_NAME = "texlive-shdoc-2023.209.2.1bsvn41991-54.1.noarch.rpm"
RPM_HASH = "78e79d11713d653f56a402983c7b339dc737272d842759b4c4b138bf46808b67a9b4b51d6f04039d6db1285da1cd07052df1d9ebaebc35838ebfe27c93c47a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shdoc.sty \
texlive-shdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
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
