SUMMARY = "A PSTricks-compatible graphicx for use with Plain TeX"
DESCRIPTION = "The package provides a version of graphicx that avoids loading \
the graphics bundle's (original) keyval package, which clashes \
with pstricks' use of xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn21717"

RPM_NAME = "texlive-pst-graphicx-2023.209.0.0.02svn21717-53.1.noarch.rpm"
RPM_HASH = "8c381f7c5cb153359b8a4bf9f4079a444f7ef9c8d6171d425308ae491d86fd9e284f32f732390d4444951153fcd56635a56cfb54c3a968d452b9a275bb20c8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-graphicx.tex \
texlive-pst-graphicx"

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
