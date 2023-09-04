SUMMARY = "Named mark registers with e-TeX"
DESCRIPTION = "E-TeX provides 32 768 mark registers; using this facility is \
far more comfortable than LaTeX tricks with \\markright, \
\\markboth, \\leftmark and \\rightmark. The package provides two \
commands for marking: \\marksthe and \\marksthecs, which have * \
forms which disable expansion; new mark registers are allocated \
as needed. Syntax is closely modelled on the \\marks primitive. \
Four commands are provided for retrieving the marks registers' \
content: \\thefirstmarks, \\thebotmarks, thetopmarks and \
\\getthemarks; and the command \\ifmarksequal is available for \
comparing the content of marks registers. The package requires \
an e-TeX-enabled engine, and the etex package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24504"

RPM_NAME = "texlive-emarks-2023.209.1.0svn24504-54.2.noarch.rpm"
RPM_HASH = "be16f473af9d560594044bce42e4ec5b7f86a76abf5c87c02c0356e7179d3826f4bf064c2383e7a149c49fee0e13fc7304f47b88b6ba29ad602b658de3fb2f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emarks.sty \
texlive-emarks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
