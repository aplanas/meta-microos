SUMMARY = "Playing Reversi in TeX"
DESCRIPTION = "Following the lead of xii.tex, this little (938 characters) \
program that plays Reversi. (The program incorporates some \
primitive AI.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63753"

RPM_NAME = "texlive-reverxii-2023.209.svn63753-54.1.noarch.rpm"
RPM_HASH = "4ba63b7c3eccf306ce36f7c99184878ee52acbe4d9044e2f32806af5e32c19d94d8a14ff8c9a93e5eaf108f2c035c2f3dc2b3d61a668de58ec67d93a916f1757"
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
