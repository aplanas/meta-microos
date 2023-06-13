SUMMARY = "Text symbols in maths mode"
DESCRIPTION = "A package which provides access to some interesting characters \
of the Text Companion fonts (TS1 encoding) in maths mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1fsvn15878"

RPM_NAME = "texlive-mathcomp-2023.201.0.0.1fsvn15878-52.1.noarch.rpm"
RPM_HASH = "6799ef3635c1acec1fe079d0d50a2c1cd37e3b738801a6b109104e963fe79b7ac81ff737d57722fb7cb43670ad7809a9c7999da1930f7028ad2315d019387292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathcomp.sty) \
texlive-mathcomp"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(textcomp.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
