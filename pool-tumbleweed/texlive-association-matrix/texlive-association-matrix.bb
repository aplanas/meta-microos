SUMMARY = "LaTeX support for creating association matrices"
DESCRIPTION = "This package allows the creation of association matrices in an \
clear and concise fashion, without having to deal with manually \
generating and modifying the tables while working. All you have \
to do is define the rows and the columns by their unique \
identifier, and then specify which cells should be marked as \
associated. Then, the \\amxgenerate command generates a table \
that shows in the cells with a blip (*) where the association \
was added. The package depends on etoolbox, forloop, ifthen, \
textcomp, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64845"

RPM_NAME = "texlive-association-matrix-2023.201.1.1svn64845-53.1.noarch.rpm"
RPM_HASH = "09d5f763fa689e11f884b891ae456a8b64e2a3b9a99349640f151b582fb79997c594d41bfda6ff332615bdff7d49e3c97caf1d367ee4833974d0bb47e77ed325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-association-matrix.sty \
texlive-association-matrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-textcomp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
