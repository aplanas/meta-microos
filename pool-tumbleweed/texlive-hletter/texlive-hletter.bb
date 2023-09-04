SUMMARY = "Flexible letter typesetting with flexible page headings"
DESCRIPTION = "The package permits the user to specify easily, with the aid of \
self defined key-words, letters (with a logo and private) and \
headings. The heading may include a footer and the letter \
provides commands to include a scanned signature and two \
signees. The package works with the merge package."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn30002"

RPM_NAME = "texlive-hletter-2023.209.4.2svn30002-54.2.noarch.rpm"
RPM_HASH = "00f1c5306fae5ef8e5799fa953a3a0a6573f1734ad2635b3ed62480a93027bb35a5e845e0ad617fbec5a62f644dd4178c4edc44835d2f8f878169809bdcbb1b5"
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
