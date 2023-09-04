SUMMARY = "BRLTTY Udev rules for braille devices that use a generic USB to serial adapter."
DESCRIPTION = "This package provides additional rules for managing BRLTTY via Udev. \
 \
Install this package in order to support braille devices that use a generic USB to serial adapter."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-udev-generic-6.6-1.1.aarch64.rpm"
RPM_HASH = "1c4a9e6ed723e9a173ea07559410bbf6b8c3e988f8638b01cb115affc61aaae981211e2bcc0a979c52cd2bffd4b308aac5a36d1da6d1e084f733d9491429ec9f"

RPROVIDES:${PN} += "brltty-udev-generic"

RDEPENDS:${PN} += "brltty"

inherit rpm
