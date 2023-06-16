SUMMARY = "Maths macros from chair X of Wurzburg University"
DESCRIPTION = "This package was developed by members of the chair for \
mathematical physics at the University of Wurzburg as a \
collection of macros and predefined environments for quickly \
creating nice mathematical documents. (Note concerning the \
package name: the 'n' stands for 'new', the 'X' is a roman 10.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn60196"

RPM_NAME = "texlive-nchairx-2023.201.1.0.0svn60196-54.1.noarch.rpm"
RPM_HASH = "fe7a9ca96938e2495ef1f9aadac565d7abe2c4f504560e4c4b194c7d442f75b977b4ba4c2ea56599c0b1343f1b2e40559c0bef83e99b45a96a85225d6f3aae4d"
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
