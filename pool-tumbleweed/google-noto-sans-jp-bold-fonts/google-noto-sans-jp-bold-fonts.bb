SUMMARY = "Noto Sans Japanese Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Bold weight of \
Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-bold-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "9ac1e143671ed9bb06c5c1f4ebb2a458448d6ac7e60607b93d86674d78f97920321a4517a8f3e7e7803a2de063fc39d56bafc5f0193ccddec4154de6e56cae0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-bold-fonts \
noto-sans-jp-bold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
