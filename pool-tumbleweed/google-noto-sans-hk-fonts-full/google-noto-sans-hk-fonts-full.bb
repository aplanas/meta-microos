SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - All Weights"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains All weights for \
Sans fonts for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-fonts-full-2.004-3.3.noarch.rpm"
RPM_HASH = "eb72695f147ae6bff896968da82a3fa2ab4226a890963b0b40fbfee873607179c5a99380f11d2559f00e0fb3c8413c417193be1733052deeba40c691f3f99cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-fonts-full \
noto-sans-hk-fonts-full"

RDEPENDS:${PN} += "google-noto-sans-hk-black-fonts \
google-noto-sans-hk-demilight-fonts \
google-noto-sans-hk-fonts \
google-noto-sans-hk-light-fonts \
google-noto-sans-hk-medium-fonts \
google-noto-sans-hk-thin-fonts"

inherit rpm
