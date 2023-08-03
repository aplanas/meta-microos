SUMMARY = "Format technical reference manuals"
DESCRIPTION = "Document classes (report- and article-style) for writing \
technical reference manuals. It offers a wide left margin for \
notes to the reader, like some of the manuals distributed by \
Adobe."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0esvn15878"

RPM_NAME = "texlive-refman-2023.209.2.0esvn15878-54.1.noarch.rpm"
RPM_HASH = "ad92c8276caeba9e0f5366231d103ba88364db46da03a997564667c6530456ea0b0b0966654a5e1effd144d52e37cec98305db835adee15f953942955c529733"
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
