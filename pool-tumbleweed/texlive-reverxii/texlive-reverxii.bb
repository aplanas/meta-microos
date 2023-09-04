SUMMARY = "Playing Reversi in TeX"
DESCRIPTION = "Following the lead of xii.tex, this little (938 characters) \
program that plays Reversi. (The program incorporates some \
primitive AI.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63753"

RPM_NAME = "texlive-reverxii-2023.209.svn63753-54.2.noarch.rpm"
RPM_HASH = "5fa804521e1050a8d7fb48d7af44a885c7d9890d06c0a6a4b39413f0dc2b81fea15d07b08b7d533bdbc3fa3ff3fa34519fe998c4161f90bd9d0d2282a87678c2"
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
