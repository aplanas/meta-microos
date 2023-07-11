SUMMARY = "Fake a regular font for bold characters"
DESCRIPTION = "This package uses PDF's text rendering to modify the linewidth \
of an outline font to get bold characters. It works only for \
vectorfonts where the glyphs are defined by their outline. The \
package works both in text and in math mode, for pdfLaTeX as \
well as for LuaLaTeX. The package depends on ifluatex, ifxetex, \
and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-2023.201.0.0.08svn55654-52.2.noarch.rpm"
RPM_HASH = "26240dbdc9af0a860965a8dec780f9aff25cf99b6d19f8fab0c44f68d174172adf9d2478528b2123357bd8420d57e83711c4ad8ab25c27deeade687dff58ec15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xfakebold.sty \
texlive-xfakebold"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifxetex.sty \
tex-pdfrender.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
