SUMMARY = "Noto Cypriot Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cypriot Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cypriot-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "0ea5ee9e552ca98288c211ef1b09202c93050b5982128316e0d59f099243234bc9d3cc8f66c590930091015374e655acd7717bc8a9dc8ab82806c9de88697804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cypriot \
noto-sans-cypriot-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
