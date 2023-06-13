SUMMARY = "'Steal' small capitals"
DESCRIPTION = "This little package is mainly meant to be used when there is a \
(TrueType or OpenType) font that does not provide real small \
capitals. As a workaround, this package helps to borrow, or \
'steal', the small capitals from another font. This might also \
be useful in the rare case that someone does not like the \
present small capitals, and wants to change them, or likes \
those from another font better. To achieve the borrowing, one \
only needs to load the package and specify the name of the \
target font via the from option. Package dependencies: pgfopts, \
iftex, fontspec."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64967"

RPM_NAME = "texlive-stealcaps-2023.201.1.1svn64967-57.1.noarch.rpm"
RPM_HASH = "f53aa64757431e8427a52a19d4bfca507f58228729ea3061e67862a071ed50480f62cf5cf054785b6c735a033963739990f87758fe89991a72c8c760b82ec09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(stealcaps.sty) \
texlive-stealcaps"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(iftex.sty) \
tex(pgfopts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
