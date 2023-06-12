SUMMARY = "Lithuanian Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Lithuanian data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-lt-2.10.0-2.5.noarch.rpm"
RPM_HASH = "e2c173ec1d5ffc787a7031ab9f0f8912e26f6d4f741f04c49323da2c4d37fd41e2b6735ffd7fd597e706c42ebf24ad9bcdf88f4f96281b2de3b4a5fd206041c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-lt \
locale(gimp-help:lt)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
