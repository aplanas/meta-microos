SUMMARY = "Fake a regular font for bold characters"
DESCRIPTION = "This package uses PDF's text rendering to modify the linewidth \
of an outline font to get bold characters. It works only for \
vectorfonts where the glyphs are defined by their outline. The \
package works both in text and in math mode, for pdfLaTeX as \
well as for LuaLaTeX. The package depends on ifluatex, ifxetex, \
and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-2023.209.0.0.08svn55654-53.1.noarch.rpm"
RPM_HASH = "a34fa7883a17f511df368bfd3517ba30e1492751ca49e035c8f98d28ce0e4915602953121b0e8a56bb76b61486cc8adeed37bbe82ad94fbb7e337d0af8953ab1"
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
