SUMMARY = "Playing Reversi in TeX"
DESCRIPTION = "Following the lead of xii.tex, this little (938 characters) \
program that plays Reversi. (The program incorporates some \
primitive AI.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63753"

RPM_NAME = "texlive-reverxii-2023.201.svn63753-53.1.noarch.rpm"
RPM_HASH = "1b63b9e8b7a0942be16240d122e1b9ffa7bd8bffea380584fbad26119e70c4d190acfce3615af9a40ab92c8157f837344825f466081c130b33ebefb1e98bb6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reverxii.tex \
texlive-reverxii"

RDEPENDS:${PN} += "/bin/sh \
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
