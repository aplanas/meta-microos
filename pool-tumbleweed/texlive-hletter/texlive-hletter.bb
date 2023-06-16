SUMMARY = "Flexible letter typesetting with flexible page headings"
DESCRIPTION = "The package permits the user to specify easily, with the aid of \
self defined key-words, letters (with a logo and private) and \
headings. The heading may include a footer and the letter \
provides commands to include a scanned signature and two \
signees. The package works with the merge package."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn30002"

RPM_NAME = "texlive-hletter-2023.201.4.2svn30002-53.1.noarch.rpm"
RPM_HASH = "bd9f75d61c1b31454a8876a1de6c6c6dbc8eb0f6be86f93cd602f4cdc33e77dfdf238ee9510e6c916208b1f01355014492a7bbc1ccb80ea06a7ec52d8d7dd539"
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
