SUMMARY = "LaTeX for Omega and Aleph"
DESCRIPTION = "The lambda package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45756"

RPM_NAME = "texlive-lambda-2023.201.svn45756-55.1.noarch.rpm"
RPM_HASH = "28ecca72cb9f78f08ee44a3e4ae93b924f9f0b2524dc6f80efb52f78da09276f5ac696bb5f8a13218dfe5893b9fde3b870f9adfcf01955fd8d105d0456492a17"
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
