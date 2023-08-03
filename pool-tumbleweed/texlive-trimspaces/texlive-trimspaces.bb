SUMMARY = "Trim spaces around an argument or within a macro"
DESCRIPTION = "A very short package that allows you to expandably remove \
spaces around a token list (commands are provided to remove \
spaces before, spaces after, or both); or to remove surrounding \
spaces within a macro definition, or to define space-stripped \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-trimspaces-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "f650010a383d4a4c63051537c47f68768c34db70b010fca304b2d206ecdc136e950941ebf5f2970347617fd8fb5c8c563f756bc45ccd91a628b8e14476ef8808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trimspaces.sty \
texlive-trimspaces"

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
