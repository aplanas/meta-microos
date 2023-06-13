SUMMARY = "Noto Sans Simplified Chinese Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Black weight of \
Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-black-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "5766783f74bd6e1cf81bc79ba33f032d3c601530540a55ac83a809ef2e260727b5bea2e79cf00c566923eef9a3d2a9047d0b8aea716de4254c9e1c5b4f88f32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-black-fonts \
noto-sans-sc-black-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
