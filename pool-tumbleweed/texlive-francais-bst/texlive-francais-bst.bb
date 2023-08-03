SUMMARY = "Bibliographies conforming to French typographic standards"
DESCRIPTION = "The package provides bibliographies (in French) conforming to \
the rules in 'Guide de la communication ecrite' (Malo, M., \
Quebec Amerique, 1996. ISBN 978-2-8903-7875-9) The BibTeX \
styles were generated using custom-bib and they are compatible \
with natbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38922"

RPM_NAME = "texlive-francais-bst-2023.209.1.1svn38922-53.1.noarch.rpm"
RPM_HASH = "3f32192d37665b87fe529a4629c645554c4ae25fe5f138a7123f90e9b9629f7ca6a479cd0940a39d73df5d5f958f9fc1aea43e53ca62710f9721baa548e6237b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-francaisbst.tex \
texlive-francais-bst"

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
