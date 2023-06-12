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

PV = "2023.201.0.0.2.3svn66019"

RPM_NAME = "texlive-postnotes-2023.201.0.0.2.3svn66019-52.1.noarch.rpm"
RPM_HASH = "1c39b232a27547c71bfa1dd59c625589f1959031cfe6bf9dedb313f141f71ed2cf5a0fe920d88fdc03a320dc1cb486d759e32709e469d5bb02a3ab88f579b519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(postnotes.sty) \
texlive-postnotes"
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
