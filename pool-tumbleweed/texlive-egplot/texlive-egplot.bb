SUMMARY = "Encapsulate Gnuplot sources in LaTeX documents"
DESCRIPTION = "A package to encapsulate gnuplot commands in a LaTeX source \
file, so that a document's figures are maintained in parallel \
with the document source itself."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02asvn20617"

RPM_NAME = "texlive-egplot-2023.201.1.02asvn20617-53.1.noarch.rpm"
RPM_HASH = "19651d78d91662da1106fc267d84aa5db31e6d344c18c267e8af5b3651f88906c5f365e598a0adc8572cbab78af3daa85912c63df1afea4d5dec4c7f286456f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egplot.sty \
texlive-egplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
