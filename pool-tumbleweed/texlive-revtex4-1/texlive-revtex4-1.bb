SUMMARY = "Styles for various Physics Journals"
DESCRIPTION = "This is an old version of revtex, and is kept as a courtesy to \
users having difficulty with the incompatibility of that latest \
version."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-2023.209.4.1ssvn56590-54.1.noarch.rpm"
RPM_HASH = "a770f0ccfb58adb1dc3e6009c0c6d1d8a898b60af34dd5897eaf0f43a03830bbdbe81f0cec6714a7002f15d23ee7d98c4af2cc691aa530707874f84086c54314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aip4-1.rtx \
tex-aps10pt4-1.rtx \
tex-aps11pt4-1.rtx \
tex-aps12pt4-1.rtx \
tex-aps4-1.rtx \
tex-apsrmp4-1.rtx \
tex-revsymb4-1.sty \
tex-revtex4-1.cls \
texlive-revtex4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fleqn.clo \
tex-hyperref.sty \
tex-lineno.sty \
tex-natbib.sty \
tex-textcase.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
