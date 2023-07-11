SUMMARY = "Noto Hanunoo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hanunoo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-hanunoo-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "1eeb31f83b730d4f25c836bc1ae225ec8d18eccf12d09c83958df2c4f1b70a12a55cee76f1eef0f06643f34b2da776716c29783dcb3947a6b78f271ab13aa28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-hanunoo \
noto-sans-hanunoo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
