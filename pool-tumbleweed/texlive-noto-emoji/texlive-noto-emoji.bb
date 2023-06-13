SUMMARY = "Noto Emoji fonts"
DESCRIPTION = "Noto Color Emoji supports all emoji defined in the latest \
Unicode version."
LICENSE = "OFL-1.1"

PV = "2023.201.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-2023.201.2.034svn62950-54.1.noarch.rpm"
RPM_HASH = "5af6c163395ec2becafa833ff9aa7f61b13fbc5ae4a386785b074ce709ae703cb0f943a23af91f8de1d1bbf5c810b413da7f20bcd469d17916db2b861c8e7992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-emoji"

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
texlive-noto-emoji-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
