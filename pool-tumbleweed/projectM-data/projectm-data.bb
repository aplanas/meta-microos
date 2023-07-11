SUMMARY = "Data files for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its data: config, presets, shaders."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-data-3.1.12-1.13.aarch64.rpm"
RPM_HASH = "fd05fb3ec3a9b33a158ffb74147faca37e9441ac5efad52dac80352fd94cbc00de6bd52370f30ce31bc676e14557f61e4579fc910749464f56dceb6fba135b67"

RPROVIDES:${PN} += "projectM-data \
projectM-qt5-data"

RDEPENDS:${PN} += "dejavu \
projectM"

inherit rpm
