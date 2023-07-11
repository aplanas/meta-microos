SUMMARY = "A guide to use of LaTeX with LuaTeX"
DESCRIPTION = "The document is a map/guide to the world of LuaLaTeX. Coverage \
supports both new users and package developers. Apart from the \
introductory material, the document gathers information from \
several sources, and offers links to others."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.208.svn30473"

RPM_NAME = "texlive-lualatex-doc-2023.208.svn30473-53.1.noarch.rpm"
RPM_HASH = "33a7f0ac82d1005f559321e55b920c1bc4cbbee4992c7200613b82848eb6dc5881828dae7041610035fd5b76fa2a6490685bf9564b114c9e667a1c1cc8a96fe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualatex-doc"

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
