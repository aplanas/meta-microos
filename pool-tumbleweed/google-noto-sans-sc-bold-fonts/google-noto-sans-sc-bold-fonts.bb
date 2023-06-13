SUMMARY = "Noto Sans Simplified Chinese Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Bold weight of \
Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-bold-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "296415dbfb75b650480f348e4282a9349d7aa67b76187595e6142cdd34dfc6d60cc9868158bf7d18125ecf52e754697f04db250bc1b4bcd2357dd558cf19156b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-bold-fonts \
noto-sans-sc-bold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
