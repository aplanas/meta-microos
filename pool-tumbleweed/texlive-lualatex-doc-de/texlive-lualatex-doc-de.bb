SUMMARY = "Guide to LuaLaTeX (German translation)"
DESCRIPTION = "The document is a German translation of the map/guide to the \
world of LuaLaTeX. Coverage supports both new users and package \
developers. Apart from the introductory material, the document \
gathers information from several sources, and offers links to \
others."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.1.0svn30474"

RPM_NAME = "texlive-lualatex-doc-de-2023.201.1.0svn30474-52.1.noarch.rpm"
RPM_HASH = "ba538d05a12c9dbc93ebba0bcef33b310b7a4ae6b7dbbb87d10fd46ee674bcdab6ea7bc6cbd911a020de8932be701773e5e576a794fa6c6789ec2448c3c404cc"
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
