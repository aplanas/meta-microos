SUMMARY = "Endnotes for LaTeX"
DESCRIPTION = "This is an endnotes package for LaTeX. Its user interface \
provides means to print multiple sections of notes along the \
document, and to subdivide them either automatically -- by \
chapter, by section -- or at manually specified places, thus \
being able to easily handle both numbered and unnumbered \
headings. The package also provides infrastructure for setting \
up contextual running headers for printed notes. The default is \
a simple but useful one, in the form 'Notes to pages N-M', but \
more elaborate ones can be built. When hyperref is loaded, \
postnotes provides hyperlinked notes, including back links."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.3svn66019"

RPM_NAME = "texlive-postnotes-2023.209.0.0.2.3svn66019-53.1.noarch.rpm"
RPM_HASH = "4de0bd751f183021105fd78127bd0cce53be82939f2edf94b39033cf7714752b56112f572043b6d679870ae1a82caddd23fcb41697eeab5a5d1de26516566533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postnotes.sty \
texlive-postnotes"

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
