SUMMARY = "Flexible letter typesetting with flexible page headings"
DESCRIPTION = "The package permits the user to specify easily, with the aid of \
self defined key-words, letters (with a logo and private) and \
headings. The heading may include a footer and the letter \
provides commands to include a scanned signature and two \
signees. The package works with the merge package."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn30002"

RPM_NAME = "texlive-hletter-2023.209.4.2svn30002-54.1.noarch.rpm"
RPM_HASH = "99f8b95f6791d4247cfd7ebd24cfb87598fb666df0d462875a8399abbcf92d09dfb327dde28d12387eb0d5703448ab7660b75f8090ad3e40fd656552d1397dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hdefine.clo \
tex-hhead.sty \
tex-hlete.clo \
tex-hletf.clo \
tex-hletg.clo \
tex-hletter.cls \
tex-hsetup.sty \
tex-mergeh.sty \
texlive-hletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
