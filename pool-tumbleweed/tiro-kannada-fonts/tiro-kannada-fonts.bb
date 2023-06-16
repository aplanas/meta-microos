SUMMARY = "Tiro Kannada Fonts"
DESCRIPTION = "Tiro Kannada has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-kannada-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "c5b01edc722aa165ee8bae1b35ca07d4e39b87810485cb6d4b4cce4497ef0d9e4da8ad1cfc0860d698d1a2434257fe71d1e31d5342deee46575c82c8b38fcf73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-kannada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
