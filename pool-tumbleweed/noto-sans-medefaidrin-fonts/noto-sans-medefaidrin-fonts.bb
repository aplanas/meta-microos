SUMMARY = "Noto Medefaidrin Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medefaidrin Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-medefaidrin-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "145fb3237153e9d3323e302ab7b89e45a87b7a83d665b20928cf08945ebfe21b90815420bd05ca617600e44170f367f401b9bc7fe9a9fb23e2714bc29d685a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-medefaidrin \
noto-sans-medefaidrin-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
