SUMMARY = "Commands to typeset recursion theory papers"
DESCRIPTION = "This package is designed to help mathematicians publishing \
papers in the area of recursion theory (aka Computability \
Theory) easily use standard notation. This includes easy \
commands to denote Turing reductions, Turing functionals, c.e. \
sets, stagewise computations, forcing and syntactic classes."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-2023.201.3.8.2svn63982-53.2.noarch.rpm"
RPM_HASH = "88a6bdfd329479fd523250799827a9306b8279bc37ae965b6f9b1e5300a2cab128dd9189420fe349027f80331f97a51383a0edddf99e4dc78f32f6ade224601c"
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
