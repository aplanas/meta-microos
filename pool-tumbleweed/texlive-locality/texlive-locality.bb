SUMMARY = "Various macros for keeping things local"
DESCRIPTION = "A toolbox of macros designed to allow the LaTeX programmer to \
work around some of the restrictions of the TeX grouping \
mechanisms. The present release offers a preliminary view of \
the package; not all of its facilities are working optimally"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn20422"

RPM_NAME = "texlive-locality-2023.201.0.0.2svn20422-54.1.noarch.rpm"
RPM_HASH = "3454acae001fa73c545d5a16bab604df88c16615ce7f93a51de19a4b3105b9e68944ef20574888154af281d887248c4cb6e5ca41d0d6e75fe6525f57e96c5eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-locality.sty \
texlive-locality"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
