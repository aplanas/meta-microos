SUMMARY = "Maths macros from chair X of Wurzburg University"
DESCRIPTION = "This package was developed by members of the chair for \
mathematical physics at the University of Wurzburg as a \
collection of macros and predefined environments for quickly \
creating nice mathematical documents. (Note concerning the \
package name: the 'n' stands for 'new', the 'X' is a roman 10.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn60196"

RPM_NAME = "texlive-nchairx-2023.209.1.0.0svn60196-55.1.noarch.rpm"
RPM_HASH = "99411752d6d3c4be3eec56cb681f56b57f771477919ee66829af6fb435c41ecd4957c30c14c0a378e234c5e0cff4652d0059f9dd9ba5561ea8306c5cbb8d22d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chairxmath.sty \
tex-nchairx.sty \
texlive-nchairx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-enumitem.sty \
tex-graphicx.sty \
tex-mathtools.sty \
tex-ntheorem.sty \
tex-suffix.sty \
tex-tensor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
