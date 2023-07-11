SUMMARY = "Noto Javanese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Javanese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-javanese-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9041c640b631ffa8fb3506bcc0d84127b2167ced8d5c4b2368e262b5873cf3d2ab639da5833a10ef4f64143f6121deb58c63accc6ac1940f9eac0f43e8653376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-javanese \
noto-sans-javanese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
