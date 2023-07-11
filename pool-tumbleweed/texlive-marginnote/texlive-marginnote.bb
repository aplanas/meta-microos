SUMMARY = "Notes in the margin, even where \\marginpar fails"
DESCRIPTION = "This package provides the command \\marginnote that may be used \
instead of \\marginpar at almost every place where \\marginpar \
cannot be used, e.g., inside floats, footnotes, or in frames \
made with the framed package."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4bsvn48383"

RPM_NAME = "texlive-marginnote-2023.208.1.4bsvn48383-53.1.noarch.rpm"
RPM_HASH = "fa44fe429eb434110dc0856c4c8fbb2c361103e219f4fbc4f893efb8c7bf8210fd0dfc745502df747a63c2487510cdab055e09a0cce84c444b57aa78cd8b97d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginnote.sty \
texlive-marginnote"

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
