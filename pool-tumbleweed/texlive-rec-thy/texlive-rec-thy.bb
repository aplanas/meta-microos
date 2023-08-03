SUMMARY = "Commands to typeset recursion theory papers"
DESCRIPTION = "This package is designed to help mathematicians publishing \
papers in the area of recursion theory (aka Computability \
Theory) easily use standard notation. This includes easy \
commands to denote Turing reductions, Turing functionals, c.e. \
sets, stagewise computations, forcing and syntactic classes."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.8.2svn63982"

RPM_NAME = "texlive-rec-thy-2023.209.3.8.2svn63982-54.1.noarch.rpm"
RPM_HASH = "dda3b7a7852ce1d462be9cca1e0762d06198c3b285ca3134a78ce7d8cb11a905b9ce67e116acc6770ae0113e1aecc86919852e1a155275b7f07ee1ed0fc84dee"
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
