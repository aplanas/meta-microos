SUMMARY = "Typeset parallel texts"
DESCRIPTION = "Provides a parallel environment which allows two potentially \
different texts to be typeset in two columns, while maintaining \
alignment. The two columns may be on the same page, or on \
facing pages. This arrangement of text is commonly used when \
typesetting translations, but it can have value when comparing \
any two texts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-parallel-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "c392c16d61b477ab3d8abc600173cb32b4f5237d2bd957e5653190153f3ac41267f5e56198d85a031fd0813425b1bd278b7136a1d04a3ab372c0c62cf70f025d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parallel.sty \
texlive-parallel"

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
