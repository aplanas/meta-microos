SUMMARY = "Typeset musical pitches with octave designations"
DESCRIPTION = "This package package typesets musical pitch names with \
designation for the octave in either the Helmholtz system (with \
octave numbers), or the traditional system (with prime \
symbols). Authors can just write \\pitch{C}{4} and the pitches \
will be rendered correctly depending on which package option \
was selected. The system can also be changed mid-document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-octave-2023.209.svn66115-55.1.noarch.rpm"
RPM_HASH = "80a9b1e2b60abd3bcb26d35d4d17c16a3d448417108f4eef1adf5f16cb4933f687dd28653ebb7327b7a8a50a8fa53fde5f19b90996507b704b814eba7b7cefc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-octave.sty \
texlive-octave"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
