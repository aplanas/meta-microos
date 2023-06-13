SUMMARY = "Noto Tinos Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tinos font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-tinos-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "2c55a87d9d6121a701af53a49b55fd9c6f998b3659303327da78b31be36eac5fab7a24a5d554faaaaa1ae13ce87d62255b24af3ca13acc3d3e4db4ba5eca749d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-tinos-fonts \
noto-tinos \
noto-tinos-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
