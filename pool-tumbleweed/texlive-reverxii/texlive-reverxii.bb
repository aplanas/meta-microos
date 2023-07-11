SUMMARY = "Playing Reversi in TeX"
DESCRIPTION = "Following the lead of xii.tex, this little (938 characters) \
program that plays Reversi. (The program incorporates some \
primitive AI.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63753"

RPM_NAME = "texlive-reverxii-2023.201.svn63753-53.2.noarch.rpm"
RPM_HASH = "1b69b0f6c0c07dfa046a3dd82ca164f33ea370e29b74010e615eb6355389d65b01851f832e0208dbad9ec01197f8cfbfc1671ad81546527c916649f3827bb5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reverxii.tex \
texlive-reverxii"

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
