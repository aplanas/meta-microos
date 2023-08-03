SUMMARY = "Demonstration code for cos and sin in TeX macros"
DESCRIPTION = "A document that both provides macros that are usable elsewhere, \
and demonstrates the macros. The code uses the 'classical' \
analytical expansion of sin and cos (the more recent trig uses \
a 'numerical analyst's' expansion)."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn43006"

RPM_NAME = "texlive-trigonometry-2023.209.svn43006-53.1.noarch.rpm"
RPM_HASH = "a194837cc200efd9b7308b2f8860609456c3bb0e48e76127001913a105d47b8912031fb5e132d185886ca4131268c1144632d27eb85483715787a26b98172c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trigonometry.tex \
texlive-trigonometry"

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
