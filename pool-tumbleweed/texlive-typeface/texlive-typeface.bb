SUMMARY = "Select a balanced set of fonts"
DESCRIPTION = "The package provides the means of establishing a consistent set \
of fonts for use in a LaTeX document. It allows mixing and \
matching the Type 1 font sets available on the archive (and it \
may be extended, via its configuration file, to support other \
fonts). Font-set definition takes the form of a set of options \
that are read when the package is loaded: for each typographic \
category (main body font, sans-serif font, monospace font, \
mathematics fonts, text figures, and so on), a font or a \
transformation is given in those options. The approach enables \
the user to remember their own configurations (as a single \
command) and to borrow configurations that other users have \
developed. The present release is designated 'for review'."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27046"

RPM_NAME = "texlive-typeface-2023.201.0.0.1svn27046-52.1.noarch.rpm"
RPM_HASH = "b4d00da661b6d3e1322bb572650658b910dfb2e7a69c89b8304cc5b180d4a04a1a52a4f5dd320fa24fa9ceb13dcc130724e59cc7e3034f8dc82208d32a75010c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typeface.cfg \
tex-typeface.sty \
texlive-typeface"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-array.sty \
tex-etexcmds.sty \
tex-etoolbox.sty \
tex-fix-cm.sty \
tex-fixmath.sty \
tex-fontenc.sty \
tex-ifetex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifthenx.sty \
tex-mathtools.sty \
tex-nfssext-cfr.sty \
tex-scalefnt.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
