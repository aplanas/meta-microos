SUMMARY = "LaTeX for Omega and Aleph"
DESCRIPTION = "The lambda package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45756"

RPM_NAME = "texlive-lambda-2023.209.svn45756-56.1.noarch.rpm"
RPM_HASH = "81db9aab7b98d7390135f1f431e5d62d7b9ceae5da2e8f65e21a20d439f6d4af689fc86cbdefabd7469ddbc913d9c1a7f25cbd6a700243d668530e8185e3be31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-lambda \
tex-UT1cmr.fd \
tex-UT1omlgc.fd \
tex-elhyph16.tex \
tex-grcodes.tex \
tex-grmhyph.tex \
tex-lambda.tex \
tex-language.dat \
tex-lchcmr.fd \
tex-lchenc.def \
tex-ocherokee.sty \
tex-odev.sty \
tex-ojapan.sty \
tex-omarab.cfg \
tex-omega.sty \
tex-omlgc.cfg \
tex-ot1omarb.fd \
tex-ot1omlgc.fd \
tex-ot1uctt.fd \
tex-ut1enc.def \
texlive-lambda"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-grlccode.tex \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
