SUMMARY = "Relative alignment of rows in numeric columns in tabulars"
DESCRIPTION = "Defines a tabular column type for formatting numerical columns \
in LaTeX. The column type enables numerical items to be right \
justified relative to each other, while centred beneath the \
column label. In addition, macros are provided to enable \
variations on this column type to be defined. Usage of the \
package is superficially similar to that of dcolumn; however, \
the alignment scheme is different, and the packages have \
different, though overlapping, applications."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn15878"

RPM_NAME = "texlive-warpcol-2023.209.1.0csvn15878-54.1.noarch.rpm"
RPM_HASH = "7df09c3ce6bd435efaf546e9cc00e6e919b44b5054e61adf73e1a725ab950b05aecc6e326333673115dcfefc2b2b93afeda4bbcfde359368bd7561dd6fc571a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-warpcol.sty \
texlive-warpcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
