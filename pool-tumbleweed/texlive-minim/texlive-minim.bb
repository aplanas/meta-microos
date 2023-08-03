SUMMARY = "A modern plain format for the LuaTeX engine"
DESCRIPTION = "This is a modern plain format for the LuaTeX engine, adding \
improved low-level support for many LuaTeX extensions and newer \
PDF features. While it can be used as drop-in replacement for \
plain TeX, it probably is most useful as a basis for your own \
formats. Most features included in the format are provided by \
separate packages that can be used on their own; see the \
packages minim-mp for mplib (MetaPost) support minim-math for \
unicode mathematics minim-pdf for creating Tagged PDF minim-xmp \
for XMP (metadata) inclusion This package contains only their \
shared lowest-level programming interface, along with their \
combined format."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "1e510ff2b01b719d9e4690a8404eb65c8a8a9b1ec749d8b2742ffda425c408949dc89387b03f04a164de2d7eb7b13edc0f71f7f845022a16eda1076e3fe189ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-alloc.tex \
tex-minim-doc.sty \
tex-minim-etex.tex \
tex-minim-hooks.tex \
tex-minim-lmodern.tex \
tex-minim-pdfresources.tex \
tex-minim-plain.tex \
tex-minim.tex \
texlive-minim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luaotfload.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
