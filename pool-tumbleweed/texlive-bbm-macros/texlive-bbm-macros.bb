SUMMARY = "LaTeX support for 'blackboard-style' cm fonts"
DESCRIPTION = "Provides LaTeX support for Blackboard variants of Computer \
Modern fonts. Declares a font family bbm so you can in \
principle write running text in blackboard bold, and lots of \
math alphabets for using the fonts within maths."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17224"

RPM_NAME = "texlive-bbm-macros-2023.209.svn17224-54.1.noarch.rpm"
RPM_HASH = "1631b9ae1ae64aaa8dc93222c13c3b0235257466fe8691da550b0ad387cb0cadbc6dcc8387a40ee665ef0bf497ad652a6f659059553c57252caf0bd3c84825e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbm.sty \
tex-ubbm.fd \
tex-ubbmss.fd \
tex-ubbmtt.fd \
texlive-bbm-macros"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
