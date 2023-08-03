SUMMARY = "Author/date style citation styles"
DESCRIPTION = "Authordate produces styles loosely based on the recommendations \
of British Standard 1629(1976), Butcher's Copy-editing and the \
Chicago Manual of Style. The bundle provides four BibTeX styles \
(authordate1, ..., authordate4), and a LaTeX package, for \
citation in author/date style. The BibTeX styles differ in how \
they format names and titles; one of them is necessary for the \
LaTeX package to work."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn52564"

RPM_NAME = "texlive-authordate-2023.209.svn52564-54.1.noarch.rpm"
RPM_HASH = "1f76cd7ff2cbfc9ead754bed87019607472baf12f8b47733960ab66a6b0c382fa71450e61fea8a2941adaf017d23f3cf629991c0cba5d18439c3b2d9d6449c06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authordate1-4.sty \
texlive-authordate"

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
