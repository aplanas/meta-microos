SUMMARY = "Select alternative section titles"
DESCRIPTION = "A package providing an interface to sectioning commands for \
selection from various title styles. E.g., marginal titles and \
to change the font of all headings with a single command, also \
providing simple one-step page styles. Also includes a package \
to change the page styles when there are floats in a page. You \
may assign headers/footers to individual floats, too."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn59845"

RPM_NAME = "texlive-titlesec-2023.201.2.14svn59845-52.1.noarch.rpm"
RPM_HASH = "bed474c596a7638789bc13bad698a3f5fecaa43f6521e836e86d9ea735abfa989b20f97913426900cdec5534147aba25bbec9c4a7ad70fc73d900da7c144ed85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titleps.sty \
tex-titlesec.sty \
tex-titletoc.sty \
texlive-titlesec"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
