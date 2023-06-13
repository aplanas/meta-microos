SUMMARY = "Tool to download, convert and install the Spotify for Linux package"
DESCRIPTION = "Spotify-easyrpm is a script which downloads the latest snap package \
from the snapcraft.io repository and converts it into an RPM for \
installation. \
 \
Automated updates are also supported and installed through the system \
update manager."
LICENSE = "GPL-3.0-only"

PV = "3.0.4"

RPM_NAME = "spotify-easyrpm-3.0.4-1.1.noarch.rpm"
RPM_HASH = "f7d51a33dc80b3b7b87e9ea6c3635dc983f2bcda988e6263a6eb9e70ccef79f2e8ebde006aadac4924441b9f45bccbc71ad227fcd618eac95af6f2d0cb985dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spotify-easyrpm"

RDEPENDS:${PN} += "/bin/bash \
createrepo_c \
jq \
rpm-build \
squashfs \
update-desktop-files"

inherit rpm
