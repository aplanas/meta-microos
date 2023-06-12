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

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "4c3ccc201d880b8547a122ce152d6a41c39b387bec8926796c7cc5565cd9ffe614bfcc395a60a6b1275fb8469b970cf84186b576f11035596b7d71adb41888db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minim-alloc.tex) \
tex(minim-doc.sty) \
tex(minim-etex.tex) \
tex(minim-hooks.tex) \
tex(minim-lmodern.tex) \
tex(minim-pdfresources.tex) \
tex(minim-plain.tex) \
tex(minim.tex) \
texlive-minim"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(luaotfload.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
