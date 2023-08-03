SUMMARY = "Support for variant code pages"
DESCRIPTION = "The package provides a mechanism for inputting non-ASCII text. \
Nowadays, the job is mostly done by the inputenc package in the \
LaTeX distribution."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51502"

RPM_NAME = "texlive-codepage-2023.209.svn51502-54.1.noarch.rpm"
RPM_HASH = "6f45ed3eb0377e0b4f9763511c38a55d476867d53c95a937d0c377c1ce79b70bc1bdbf903edd74d6a4f7322b6dd8bdf987be654fafd8e9914d450f49f220ef57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-code437.tex \
tex-code850.tex \
tex-codeiso1.tex \
tex-codemac.tex \
tex-codepage.sty \
tex-initcar.tex \
tex-shapecm.tex \
tex-shapedc.tex \
texlive-codepage"

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
