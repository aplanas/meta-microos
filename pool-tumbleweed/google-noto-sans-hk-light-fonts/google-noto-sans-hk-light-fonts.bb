SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Light weight of \
Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-light-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "65f5a7b67afcdf5c504fc23de242b000233e4caeeb547a6929870029a4497b7bdb9a86181eb7564b638e0a3225a749b4c27a0f059b804dd5810d308b0912a370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-light-fonts \
noto-sans-hk-light-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
