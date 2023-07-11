SUMMARY = "Udev rules for Airspy HF+ SDR"
DESCRIPTION = "Udev rules for Airspy HF+ SDR."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-udev-1.6.8-1.13.aarch64.rpm"
RPM_HASH = "7eb2ec27d027b5b8c5963c659b54c923000ae341c8cf73daf85c086ad82757452e574db7adab96acbf6780bb64d4bdcf043fe40b00b6ab45b1e1829e7688cf4e"

RPROVIDES:${PN} += "airspyhf-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
