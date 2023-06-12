SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - DemiLight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Demilight weight \
of Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-demilight-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "d0bfa297bce34c9f29c5fbae7cc0fcd28efd735e2bce4c172c35d2d7e9e454484abe32916d7740b892b9a6b17bd4b511b3b0ae0499f4a737ef4fe184ad735573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-demilight-fonts \
noto-sans-hk-demilight-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
