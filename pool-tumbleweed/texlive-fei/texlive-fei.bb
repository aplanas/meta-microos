SUMMARY = "Class for academic works at FEI University Center -- Brazil"
DESCRIPTION = "fei is a class created by graduate students and LaTeX \
enthusiasts that allows students from FEI University Center to \
create their academic works, be it a monograph, masters \
dissertation or phd thesis, under the typographic rules of the \
institution. The class makes it possible to create a full \
academic work, supporting functionalities such as cover, title \
page, catalog entry, dedication, summary, lists of figures, \
tables, algorithms, acronyms and symbols, multiple authors, \
index, references, appendices and attachments. fei is loosely \
based in the Brazilian National Standards Organization \
(Associacao Brasileira de Normas Tecnicas, ABNT) standards for \
the creation of academic works, such as ABNT NBR 10520:2002 \
(Citations) and ABNT NBR 6023:2002 (Bibliographic References)."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.10.4svn65352"

RPM_NAME = "texlive-fei-2023.209.4.10.4svn65352-53.1.noarch.rpm"
RPM_HASH = "c202061851963e08cb1e33d7073030f2576ba588def2331f4aa8f66bf1f8e7843aa227e3c0ecf3e99f801ca7c68f30ad563d7bd55b280011d4bcf7aa41536662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fei.cls \
texlive-fei"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amsthm.sty \
tex-arimo.sty \
tex-babel.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-glossaries-extra.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-icomma.sty \
tex-ifthen.sty \
tex-imakeidx.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lmodern.sty \
tex-mathtools.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-morewrites.sty \
tex-newtxtext.sty \
tex-pdfpages.sty \
tex-pdfx.sty \
tex-thmtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
