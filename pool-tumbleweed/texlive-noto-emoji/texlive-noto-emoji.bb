SUMMARY = "Noto Emoji fonts"
DESCRIPTION = "Noto Color Emoji supports all emoji defined in the latest \
Unicode version."
LICENSE = "OFL-1.1"

PV = "2023.209.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-2023.209.2.034svn62950-55.1.noarch.rpm"
RPM_HASH = "f7acea62b44ea88f67cf86b70a841eb6c120b130a8f234cf90bc784aa8bf0c4d06c53e0a6ae71d4596a7c0cec530cebc2588d03a28fd60a00b030779cc725bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-emoji"

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
texlive-noto-emoji-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
