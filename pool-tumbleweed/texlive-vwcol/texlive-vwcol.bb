SUMMARY = "Variable-width multiple text columns"
DESCRIPTION = "The package provides a crude environment (vwcol) for \
typesetting multicolumn paragraph text of various column widths \
on a single page."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn36254"

RPM_NAME = "texlive-vwcol-2023.209.0.0.2svn36254-54.1.noarch.rpm"
RPM_HASH = "bf6ad168516ba3fafa590edca76c2928733d4c4d32d50cbf1b7c43df1a895b35f561436c4b6c45f0bc87c610e83c98d09ad216194bfcdf7f099bc102f1918486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vwcol.sty \
texlive-vwcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-environ.sty \
tex-keyval.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
