SUMMARY = "Noto Sans Korean Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-mono-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "e6a62db04f3048ea992dc36bad396256796bb59025e30ba69b760bbfd5e06cc48beebf9b06499a0e46aff3897994418a42ec81743929bf594bb7b09c8fed9bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-mono-fonts \
noto-sans-kr-mono-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
