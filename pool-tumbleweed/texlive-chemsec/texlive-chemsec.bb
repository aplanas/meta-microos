SUMMARY = "Automated creation of numeric entity labels"
DESCRIPTION = "Packages provides creation of sequential numeric labels for \
entities in a document. The motivating example is chemical \
structures in a scientific document. The package can \
automatically output a full object name and label on the first \
occurence in the document and just labels only on subsequent \
references."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12asvn46972"

RPM_NAME = "texlive-chemsec-2023.209.1.12asvn46972-54.1.noarch.rpm"
RPM_HASH = "0e2bfa1e2e85a0e33c692098a66f963934efa395b08eeb8bf052178ddca704559045252890ee5584d3cf8273c82fc92db3cb3a16925f0210609f7f5da44c3d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemsec.sty \
texlive-chemsec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
