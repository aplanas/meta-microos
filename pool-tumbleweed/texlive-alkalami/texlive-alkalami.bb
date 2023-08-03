SUMMARY = "A font for Arabic-based writing systems in Nigeria and Niger"
DESCRIPTION = "This font is designed for Arabic-based writing systems in the \
Kano region of Nigeria and Niger."
LICENSE = "OFL-1.1"

PV = "2023.209.1.000svn44497"

RPM_NAME = "texlive-alkalami-2023.209.1.000svn44497-55.1.noarch.rpm"
RPM_HASH = "ab2932bb5d5e195e210cc25f00cd2723738f20b93aadc3f7c82377ac3803f02850df65d452107803a137a74554841a337bbf4f0b9b1a81fbf6c34e367e769fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alkalami"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-alkalami-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
