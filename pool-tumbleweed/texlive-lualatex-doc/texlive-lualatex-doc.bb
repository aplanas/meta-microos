SUMMARY = "A guide to use of LaTeX with LuaTeX"
DESCRIPTION = "The document is a map/guide to the world of LuaLaTeX. Coverage \
supports both new users and package developers. Apart from the \
introductory material, the document gathers information from \
several sources, and offers links to others."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.svn30473"

RPM_NAME = "texlive-lualatex-doc-2023.201.svn30473-52.1.noarch.rpm"
RPM_HASH = "29280c0fa6abe5d50317764ca0f9708025164a05e62809aa6a14e882d714c1bf2d9ddabe81501003b9baafe3f76aaba8bc26db961c98412b24ab46389498fc52"
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
