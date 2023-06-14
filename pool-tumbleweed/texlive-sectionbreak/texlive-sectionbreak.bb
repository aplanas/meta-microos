SUMMARY = "LaTeX support for section breaks"
DESCRIPTION = "This package provides LaTeX support for section breaks, used \
mainly in fiction books to signal changes in a story, like \
changes in time, location, etc. It supports the asterism \
symbol, text content, or custom macros as the section break \
mark symbol."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1dsvn50339"

RPM_NAME = "texlive-sectionbreak-2023.201.0.0.1dsvn50339-53.1.noarch.rpm"
RPM_HASH = "a8e6c948ad3ffe74a91a950917313b47bc6208d45d38f5ff852a2b11bd4dae949412e2ad9fcada27e32a64a0e356cf4d26d8c370346658a29ee885228c7a80f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sectionbreak.sty \
texlive-sectionbreak"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
