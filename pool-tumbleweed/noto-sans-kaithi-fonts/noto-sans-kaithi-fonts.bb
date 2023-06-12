SUMMARY = "Noto Kaithi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kaithi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kaithi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "cc9e96826f93d1d838f4c07d1db5e219a31ef8f59a29de3b104e390ff66dc92eec1449333a63fe86d70b1f1fd17e62cb19d3cb4125032f9adc75b75952c94b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kaithi \
noto-sans-kaithi-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
