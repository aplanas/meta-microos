SUMMARY = "Typeset Subversion keywords"
DESCRIPTION = "A package for incorporating the values of Subversion keywords \
into typeset documents. Information about Subversion (a \
replacement for CVS) is available from the project's home site."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.4svn62157"

RPM_NAME = "texlive-svninfo-2023.201.0.0.7.4svn62157-57.1.noarch.rpm"
RPM_HASH = "63f9b6d6ab679b3f0fd666ebb264ae53966e56507bb86e7c1c3b4dd5ec2135331a322c3e061557eb48ad64e7cf16749917a3dbc8dde94f160b9ed655a87469e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svninfo.cfg \
tex-svninfo.sty \
texlive-svninfo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
