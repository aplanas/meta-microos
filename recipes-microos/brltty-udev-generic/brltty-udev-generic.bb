SUMMARY = "BRLTTY Udev rules for braille devices that use a generic USB to serial adapter."
DESCRIPTION = "This package provides additional rules for managing BRLTTY via Udev. \
 \
Install this package in order to support braille devices that use a generic USB to serial adapter."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-udev-generic-6.5-2.4.aarch64.rpm"
RPM_HASH = "93ad50fa6877badc7d3dc4923ed5f102c65b40d0f0c81c9776dab5b5a9f902e4396ddc3c2549b51ca38495deb0d756d17d88bb90a54e944857b1b697b774b98a"

RPROVIDES:${PN} += "brltty-udev-generic brltty-udev-generic(aarch-64)"
RDEPENDS:${PN} += "brltty"

inherit rpm
