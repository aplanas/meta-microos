SUMMARY = "Noto Malayalam Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-malayalam-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "f1cee40915657510f2f9036160e8149ab8079e342a7990edbc627bdfbde254a74af7230a224743bb5e00ea3239f384f944db5bdf67125c59f70920e7e6caf9d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-malayalam-ui \
noto-sans-malayalam-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
