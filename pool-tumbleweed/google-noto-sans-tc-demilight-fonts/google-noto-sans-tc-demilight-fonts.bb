SUMMARY = "Noto Sans Traditional Chinese Font - DemiLight"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Demilight weight \
of Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-demilight-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "bc7b91b4606066e584b0dbd048562e3ecf6956b0d388e6fbc477c4020401673072d79a6378088a89128977e291e2f6f042aff38a916fcdfa34f5ab502db3fdf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-demilight-fonts \
noto-sans-tc-demilight-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
