SUMMARY = "Typeset diaries or journals"
DESCRIPTION = "A class, based on scrbook, designed for typesetting diaries, \
journals or devotionals."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27810"

RPM_NAME = "texlive-scrjrnl-2023.209.0.0.1svn27810-54.1.noarch.rpm"
RPM_HASH = "d3917c0048b1ebd02367c3a0e6b48cf97b0041e51b24c2f5c18d148a6a3489c9e6ae8868dd843b2236a8f72c4a5cf59d992fd20bc4210488f2c9687c0b763f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrjrnl.cls \
texlive-scrjrnl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-datetime.sty \
tex-fancytabs.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
