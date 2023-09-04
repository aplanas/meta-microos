SUMMARY = "Format technical reference manuals"
DESCRIPTION = "Document classes (report- and article-style) for writing \
technical reference manuals. It offers a wide left margin for \
notes to the reader, like some of the manuals distributed by \
Adobe."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0esvn15878"

RPM_NAME = "texlive-refman-2023.209.2.0esvn15878-54.2.noarch.rpm"
RPM_HASH = "c20c5ded9ef1137464a949504e4c7e141e17d49a03cb4abbcd33a64b23513dbd02f34a50579a8addf9ec38b4939a101be6921d95a3f965a27813bf68da403e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagepc.sty \
tex-refart.cls \
tex-refrep.cls \
texlive-refman"

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
