SUMMARY = "Noto Sans Traditional Chinese Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Black weight of \
Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-black-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "b6f492225e7a8a87dcaa7f08ea9b542507dccd3193b9f4c57290f23886235a14f14b77bb00e055c1be555514de803800627e97364efd4c326980834fed8455d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-black-fonts \
noto-sans-tc-black-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
