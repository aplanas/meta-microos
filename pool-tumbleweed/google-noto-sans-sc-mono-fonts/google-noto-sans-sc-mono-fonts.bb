SUMMARY = "Noto Sans Simplified Chinese Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-mono-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "b76c632ee6bc6395c889fae6f60c305a3d8d24690c436d14c14e7c44138d2d36ae49f5121db46b896eed047ba091806a4f8722a87d40e1a4d168cfd48eb68403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-mono-fonts \
noto-sans-sc-mono-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
