SUMMARY = "Automated creation of numeric entity labels"
DESCRIPTION = "Packages provides creation of sequential numeric labels for \
entities in a document. The motivating example is chemical \
structures in a scientific document. The package can \
automatically output a full object name and label on the first \
occurence in the document and just labels only on subsequent \
references."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12asvn46972"

RPM_NAME = "texlive-chemsec-2023.201.1.12asvn46972-53.1.noarch.rpm"
RPM_HASH = "50dd9f40ae24078c774c4a001d190a5a2a2f9fc5fa766dd5584d9abc9f3b1c32ce6f3dfa82cf4922360a74784565d298a691cf12836661d109147a493ae4859e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemsec.sty) \
texlive-chemsec"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
