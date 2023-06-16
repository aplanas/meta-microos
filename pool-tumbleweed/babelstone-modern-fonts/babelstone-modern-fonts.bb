SUMMARY = "Latin Modern Font"
DESCRIPTION = "BabelStone latin modern font."
LICENSE = "OFL-1.1"

PV = "6.002"

RPM_NAME = "babelstone-modern-fonts-6.002-3.17.noarch.rpm"
RPM_HASH = "7eac1336d03b2ada0d5bb280aeed41281d53d9d0d88d8d694e052c5909655f7b1013bc4a36f4fe60d02b3d160e642e7cb251e7031c6a6254a56050f7480c91c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-modern-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
