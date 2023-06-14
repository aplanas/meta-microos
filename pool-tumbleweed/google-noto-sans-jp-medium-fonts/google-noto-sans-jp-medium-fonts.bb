SUMMARY = "Noto Sans Japanese Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Medium weight of \
Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-medium-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "0443a4996da64d016fbd5ef7aa9feef20671c9458c65a329ea7c26f7feb7f462d33a77601c19bb822165b6275ed23b0cfcf6397e5c6225635dc4002929e978d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-medium-fonts \
noto-sans-jp-medium-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
