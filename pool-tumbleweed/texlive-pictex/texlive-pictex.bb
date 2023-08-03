SUMMARY = "Picture drawing macros for TeX and LaTeX"
DESCRIPTION = "PicTeX is an early and very comprehensive drawing package that \
mostly draws by placing myriads of small dots to make up \
pictures. It has a tendency to run out of space; packages \
m-pictex and pictexwd deal with the problems in different ways."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn59551"

RPM_NAME = "texlive-pictex-2023.209.1.1bsvn59551-52.1.noarch.rpm"
RPM_HASH = "b7d8b9c48dadc6672ae6ccc05b6dc845de99ac06e6fa27fc617a1cf97872ff320bd0e3486308ef5c2cb6ca6aaa43d781cbe8a764fcd9dcfbd27ee7366d0a5256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-errorbars.tex \
tex-latexpicobjs.tex \
tex-piccorr.sty \
tex-picmore.tex \
tex-pictex.sty \
tex-pictex.tex \
tex-pictexwd.sty \
tex-pictexwd.tex \
tex-pointers.tex \
tex-postpictex.tex \
tex-prepictex.tex \
tex-texpictex.tex \
tex-tree.sty \
texlive-pictex"

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
