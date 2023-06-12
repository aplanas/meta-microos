SUMMARY = "Typeset mathematical double stroke symbols"
DESCRIPTION = "A font based on Computer Modern Roman useful for typesetting \
the mathematical symbols for the natural numbers (N), whole \
numbers (Z), rational numbers (Q), real numbers (R) and complex \
numbers (C); coverage includes all Roman capital letters, '1', \
'h' and 'k'. The font is available both as Metafont source and \
in Adobe Type 1 format, and LaTeX macros for its use are \
provided. The fonts appear in the blackboard bold sampler."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.111svn15878"

RPM_NAME = "texlive-doublestroke-2023.201.1.111svn15878-52.1.noarch.rpm"
RPM_HASH = "45a1cc3e33444ad069876550a82b2cfb3d40d8a2c910863df79d5893af56dfd1cb002fa0ca1729381120050a4624f78f6f9f407386d3f7dc6081ff9a2a3f58ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Udsrom.fd) \
tex(Udsss.fd) \
tex(dsfont.sty) \
tex(dsrom10.tfm) \
tex(dsrom12.tfm) \
tex(dsrom8.tfm) \
tex(dsss10.tfm) \
tex(dsss12.tfm) \
tex(dsss8.tfm) \
tex(dstroke.map) \
texlive-doublestroke"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-doublestroke-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
