SUMMARY = "Guide to LuaLaTeX (German translation)"
DESCRIPTION = "The document is a German translation of the map/guide to the \
world of LuaLaTeX. Coverage supports both new users and package \
developers. Apart from the introductory material, the document \
gathers information from several sources, and offers links to \
others."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.208.1.0svn30474"

RPM_NAME = "texlive-lualatex-doc-de-2023.208.1.0svn30474-53.1.noarch.rpm"
RPM_HASH = "f1c30bd977519817e6a7499f6301f103d3fb9eed138432cb1ff8a183b42067e60e8e3de2b16d03c680400ada5c85ca897e517460438aaab0980cae6fe9f47e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualatex-doc-de"

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
