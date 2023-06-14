SUMMARY = "Noto Sans Japanese Font - DemiLight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Demilight weight \
of Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-demilight-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "d931dff2358a61d9fbabf956f1c29a06202a36c34b05f706f2af8dc125fca4ec075434234edf7a436c9a9334a9daaeaa5fbc8a9bb6ef4968f948585dae1ce500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-demilight-fonts \
noto-sans-jp-demilight-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
