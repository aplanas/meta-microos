SUMMARY = "Noto Tamil Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tamil-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e9e6f8f5d40e2dff996e0e35363a0c503c176ee339b5392d96870540381536c1cbe5892a9ffc6d0589c164951ffefd6d2a8b7eeb0fc47993f601e1e247eb8e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-tamil \
noto-serif-tamil-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
