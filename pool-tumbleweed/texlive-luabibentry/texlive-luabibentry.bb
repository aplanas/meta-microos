SUMMARY = "Repeat BibTeX entries in a LuaLaTeX document body"
DESCRIPTION = "The package reimplements bibentry, for use in LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1asvn55777"

RPM_NAME = "texlive-luabibentry-2023.208.0.0.1asvn55777-53.1.noarch.rpm"
RPM_HASH = "aacb985be75e890650ebdf34154502a962e5e04e44f233c39233eeb46a57e6de8061e0df5aa31c182217fb330749be097eb6851d6afc2ddb3c89550b23265832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luabibentry.sty \
texlive-luabibentry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
