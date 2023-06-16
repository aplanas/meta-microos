SUMMARY = "Udev rules for Airspy HF+ SDR"
DESCRIPTION = "Udev rules for Airspy HF+ SDR."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-udev-1.6.8-1.12.aarch64.rpm"
RPM_HASH = "b4b710f2fffccb419bbd2d0ee74c88328e25315cd0c4be66359d8542fb46cde0402ebd7cd5e068c60bc238dd4ea00e2821254435ceaebde4448ff8d2c5efb39c"

RPROVIDES:${PN} += "airspyhf-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
