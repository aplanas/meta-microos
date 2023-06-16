SUMMARY = "Document configuration with tags"
DESCRIPTION = "The package allows the user to generate multiple documents from \
a single source, by marking pieces of the document with tags \
and specifying which marked pieces to include or exclude."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0.1svn52064"

RPM_NAME = "texlive-tagging-2023.201.1.1.0.1svn52064-54.1.noarch.rpm"
RPM_HASH = "2711852b4f6c3272af7916292564073e79590566170fe365dad02e82f5c2d8a2a26c1e75f7eb13f9a9bad3b01c2f48dc957c5df8c1fedced2658898299324f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tagging.sty \
texlive-tagging"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
