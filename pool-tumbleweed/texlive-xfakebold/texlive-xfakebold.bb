SUMMARY = "Fake a regular font for bold characters"
DESCRIPTION = "This package uses PDF's text rendering to modify the linewidth \
of an outline font to get bold characters. It works only for \
vectorfonts where the glyphs are defined by their outline. The \
package works both in text and in math mode, for pdfLaTeX as \
well as for LuaLaTeX. The package depends on ifluatex, ifxetex, \
and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-2023.209.0.0.08svn55654-53.2.noarch.rpm"
RPM_HASH = "fca2e911a71e4df4342555ad95d10d7209e4dff5021682adbafc7e0690daa8a85b0d1fbea46f0481faa5a9602e3a997fae6a6342e6be3eef648c82f80d4e95b0"
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
