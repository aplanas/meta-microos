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

PV = "2023.209.1.1svn64967"

RPM_NAME = "texlive-stealcaps-2023.209.1.1svn64967-58.1.noarch.rpm"
RPM_HASH = "8412808a92b51fc239eb284ce562ebc8bac54bda0dad18334fffea2272fcf43c532aae589bc79b80a8ce0befa4deecfe92e3c456f98c0e65843d53964d63b0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stealcaps.sty \
texlive-stealcaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-pgfopts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
