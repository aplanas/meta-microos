SUMMARY = "Variable-width multiple text columns"
DESCRIPTION = "The package provides a crude environment (vwcol) for \
typesetting multicolumn paragraph text of various column widths \
on a single page."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn36254"

RPM_NAME = "texlive-vwcol-2023.201.0.0.2svn36254-53.1.noarch.rpm"
RPM_HASH = "7f6153f10c4c80c3dcf2f1cbe421bb163f69296a7c87771655a973469a0ba27ab0c18fa9fb92808ed44775ee49cede777512cde3b61917ff257c3c9ee2bd1598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(vwcol.sty) \
texlive-vwcol"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(color.sty) \
tex(environ.sty) \
tex(keyval.sty) \
tex(ragged2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
