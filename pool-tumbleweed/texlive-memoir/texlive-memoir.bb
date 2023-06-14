SUMMARY = "Typeset fiction, non-fiction and mathematical books"
DESCRIPTION = "The memoir class is for typesetting poetry, fiction, \
non-fiction, and mathematical works. Permissible document \
'base' font sizes range from 9 to 60pt. There is a range of \
page-styles and well over a dozen chapter-styles to choose \
from, as well as methods for specifying your own layouts and \
designs. The class also provides the functionality of over \
thirty of the more popular packages, thus simplifying document \
sources. Users who wish to use the hyperref package, in a \
document written with the memoir class, should also use the \
memhfixc package (part of this bundle). Note, however, that any \
current version of hyperref actually loads the package \
automatically if it detects that it is running under memoir."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.7.19svn65040"

RPM_NAME = "texlive-memoir-2023.201.3.7.19svn65040-52.1.noarch.rpm"
RPM_HASH = "80ba5d452e7e215c5b7d1e655ff90bb83abee654755e6e790a87c6084297a3c9541aa96c8854bc8350be8ea415796f713fdeffa5a74d4e7ec9ce80dcfd00a88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mem10.clo \
tex-mem11.clo \
tex-mem12.clo \
tex-mem14.clo \
tex-mem17.clo \
tex-mem20.clo \
tex-mem25.clo \
tex-mem30.clo \
tex-mem36.clo \
tex-mem48.clo \
tex-mem60.clo \
tex-mem9.clo \
tex-memhfixc.sty \
tex-memoir.cls \
texlive-memoir"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-dcolumn.sty \
tex-delarray.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-mparhack.sty \
tex-tabularx.sty \
tex-textcase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
