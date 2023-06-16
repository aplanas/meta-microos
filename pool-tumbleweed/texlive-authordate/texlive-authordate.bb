SUMMARY = "Author/date style citation styles"
DESCRIPTION = "Authordate produces styles loosely based on the recommendations \
of British Standard 1629(1976), Butcher's Copy-editing and the \
Chicago Manual of Style. The bundle provides four BibTeX styles \
(authordate1, ..., authordate4), and a LaTeX package, for \
citation in author/date style. The BibTeX styles differ in how \
they format names and titles; one of them is necessary for the \
LaTeX package to work."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn52564"

RPM_NAME = "texlive-authordate-2023.201.svn52564-53.1.noarch.rpm"
RPM_HASH = "26f1d9d6d37c9621b0b1000a57aec5bff56a857d497fea7d61d0dee7015f78da744d2e24dec5ff7976f068e53887c19e333850d8d5fd33a3c02b7ea8fb328e19"
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
