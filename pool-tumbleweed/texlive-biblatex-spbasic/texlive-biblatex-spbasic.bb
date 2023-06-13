SUMMARY = "A BibLaTeX style emulating Springer's old spbasic.bst"
DESCRIPTION = "This package provides a bibliography and citation style for \
BibLaTeX/biber for typesetting articles for Springer's \
journals. It is the same as the old BibTeX style spbasic.bst."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn61439"

RPM_NAME = "texlive-biblatex-spbasic-2023.201.0.0.04svn61439-53.1.noarch.rpm"
RPM_HASH = "8fc2baac3de14898e6f70ce36cbe7b730cdc6621b20ba14e193a6d0e48ea7d6e534c79df75afdcb17950d74b3de0e395be08094bcc86271b9b8d84b7762ccfe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-spbasic.bbx) \
tex(biblatex-spbasic.cbx) \
tex(biblatex-spbasic.lbx) \
texlive-biblatex-spbasic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(authoryear.bbx) \
tex(authoryear.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
