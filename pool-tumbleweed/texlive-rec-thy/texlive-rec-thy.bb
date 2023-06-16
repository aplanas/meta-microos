SUMMARY = "Commands to typeset recursion theory papers"
DESCRIPTION = "This package is designed to help mathematicians publishing \
papers in the area of recursion theory (aka Computability \
Theory) easily use standard notation. This includes easy \
commands to denote Turing reductions, Turing functionals, c.e. \
sets, stagewise computations, forcing and syntactic classes."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-2023.201.3.8.2svn63982-53.1.noarch.rpm"
RPM_HASH = "63d2af2417c1f1875d4ccc5e7631301494ad41d36ba137a96f73839a213da17b953e5d4d12228bcea29264485faa4bf168c7542068f11225597e2457d79a973a"
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
