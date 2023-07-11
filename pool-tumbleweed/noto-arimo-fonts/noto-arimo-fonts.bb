SUMMARY = "Noto Arimo Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Arimo font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-arimo-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b0f1fd0273767308eabe5480eb859f911eac100ddf8cfdb908ffc153af67c99e5f30ec3ee2a69a8640023d3144541b63e43660fc479a05861ecc6bc981495d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-arimo-fonts \
noto-arimo \
noto-arimo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
