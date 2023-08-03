SUMMARY = "Execute stuff at \\shipout time"
DESCRIPTION = "This package is a modern reimplementation of package everyshi, \
providing various commands to be executed before a \\shipout \
command. It makes use of e-TeX's facilities if they are \
available. The package may be used either with LaTeX or with \
plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.19svn53051"

RPM_NAME = "texlive-atbegshi-2023.209.1.19svn53051-54.1.noarch.rpm"
RPM_HASH = "f29d30a705ab37e1ef52754284902a1b2b14476ede3c4aabcaaa4afac7f6afe8d457aa7dbad07973a713c3fba81151226a28a5e995dcbcab1f4bce019f4ddccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atbegshi.sty \
texlive-atbegshi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
