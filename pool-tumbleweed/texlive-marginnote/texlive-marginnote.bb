SUMMARY = "Notes in the margin, even where \\marginpar fails"
DESCRIPTION = "This package provides the command \\marginnote that may be used \
instead of \\marginpar at almost every place where \\marginpar \
cannot be used, e.g., inside floats, footnotes, or in frames \
made with the framed package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4bsvn48383"

RPM_NAME = "texlive-marginnote-2023.201.1.4bsvn48383-52.1.noarch.rpm"
RPM_HASH = "51c1d7b3ac4b219c61a0ce7149f948fd8a01523a251b470cbb0cc46934639e82eb05133fce7e671a8c12f79f5df64ae1549c82d528c90416b45564368d6c299c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginnote.sty \
texlive-marginnote"

RDEPENDS:${PN} += "/bin/sh \
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
