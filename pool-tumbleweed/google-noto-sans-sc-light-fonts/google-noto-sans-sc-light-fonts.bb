SUMMARY = "Noto Sans Simplified Chinese Font - Light"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Light weight of \
Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-light-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "9d9931f96b56cd410836bb8d12d6c75abfa5215fde91de4de5f7ef01ae6f8f73471614d9cafded6715078eaf79154aa2999c3fcf26044484be7909be6a858837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-light-fonts \
noto-sans-sc-light-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
