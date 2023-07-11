SUMMARY = "Flexible letter typesetting with flexible page headings"
DESCRIPTION = "The package permits the user to specify easily, with the aid of \
self defined key-words, letters (with a logo and private) and \
headings. The heading may include a footer and the letter \
provides commands to include a scanned signature and two \
signees. The package works with the merge package."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn30002"

RPM_NAME = "texlive-hletter-2023.201.4.2svn30002-53.2.noarch.rpm"
RPM_HASH = "c69dd5f189414cb9cc3aac0fce08a753b5e73cf0eed5691f5d0c33dedd34ac51cf0f99685c3e60762f91aa391aee09f8b2daae5492500abb8de84e00c763d93a"
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
