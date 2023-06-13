SUMMARY = "Noto Serif Japanese Font - Extralight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Extralight weight of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-extralight-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "36a47af8fc6cb8b3bdca9fc9202cf4b311e9505da77e651454bc7144c0bd7ab639c35a29c75791d3f0b7cc9d8db6245398258eeb149446ddafadd280c3d9bd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-extralight-fonts \
noto-serif-jp-extralight-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
