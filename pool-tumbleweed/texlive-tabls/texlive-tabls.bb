SUMMARY = "Better vertical spacing in tables and arrays"
DESCRIPTION = "Modifies LaTeX's array and tabular environments to keep text \
from touching other text or hlines above or below. Several new \
parameters are defined and some standard macros are re-defined. \
The package slows down compilation of tables, since each entry \
is boxed twice."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5svn17255"

RPM_NAME = "texlive-tabls-2023.201.3.5svn17255-54.1.noarch.rpm"
RPM_HASH = "26ff7bae6e6b24ce19081889f8c8c07957967562ccc6be5a3df57738f8a7529d0b52a424620142e295fb4926aa60848c323633c0777aa7d40d27382cd3d4f240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tabls.sty) \
texlive-tabls"
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
