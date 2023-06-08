SUMMARY = "BRLTTY Udev rules for braille devices that use a generic USB to serial adapter."
DESCRIPTION = "This package provides additional rules for managing BRLTTY via Udev. \
 \
Install this package in order to support braille devices that use a generic USB to serial adapter."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-udev-generic-6.5-2.3.aarch64.rpm"
RPM_HASH = "9d4eb7a4befe7e794becb1a9c911d5997fa83a5c7f698ac1406f18d128801e4b0399fac5a3e8ba076a164a3bffc3f8e7393e5db22e9df2cc12e4880185a827ad"

RPROVIDES:${PN} += "brltty-udev-generic brltty-udev-generic(aarch-64)"
RDEPENDS:${PN} += "brltty"

inherit rpm
