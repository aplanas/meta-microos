SUMMARY = "BRLTTY Udev rules for braille devices that use a generic USB to serial adapter."
DESCRIPTION = "This package provides additional rules for managing BRLTTY via Udev. \
 \
Install this package in order to support braille devices that use a generic USB to serial adapter."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-udev-generic-6.5-3.1.aarch64.rpm"
RPM_HASH = "78215eba0b6e33c50265d38f2b993f1a03f58a3dd72291e7aa5a5b724f0cea84a08e579133089ec30ca17c32cb1409ce70f400ef1028b7986b254b67a17a89be"

RPROVIDES:${PN} += "brltty-udev-generic"

RDEPENDS:${PN} += "brltty"

inherit rpm
