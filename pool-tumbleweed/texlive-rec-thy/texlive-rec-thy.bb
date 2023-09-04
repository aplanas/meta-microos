SUMMARY = "Commands to typeset recursion theory papers"
DESCRIPTION = "This package is designed to help mathematicians publishing \
papers in the area of recursion theory (aka Computability \
Theory) easily use standard notation. This includes easy \
commands to denote Turing reductions, Turing functionals, c.e. \
sets, stagewise computations, forcing and syntactic classes."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-2023.209.3.8.2svn63982-54.2.noarch.rpm"
RPM_HASH = "5cb90d6a303f41e309fa1c2bb98309c7e6a92e076fd9f839b9cc5f852488ea4a5fbbffe89f16487a5c8fca394af63b9b41ef4fcef7e72cf307293e1e6ef3aadf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rec-thy.sty \
texlive-rec-thy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-ifmtarg.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ltxcmds.sty \
tex-mathbbol.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-pict2e.sty \
tex-picture.sty \
tex-suffix.sty \
tex-unicode-math.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
