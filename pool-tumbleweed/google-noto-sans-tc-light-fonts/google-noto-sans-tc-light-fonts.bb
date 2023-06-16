SUMMARY = "Noto Sans Traditional Chinese Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Light weight of \
Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-light-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "a16159b080e8b930f7db2a8855a1aea59bd01be3e0431269e81d424c65737818c0257375478d0479a9ca882f99423e806839b9141f9fb74dafbd3a0e0d3b6dc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-light-fonts \
noto-sans-tc-light-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
