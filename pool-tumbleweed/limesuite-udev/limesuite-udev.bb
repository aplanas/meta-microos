SUMMARY = "Udev rules for LimeSDR"
DESCRIPTION = "Udev rules for Lime Suite"
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "limesuite-udev-22.09.1-2.3.noarch.rpm"
RPM_HASH = "96cb8a8ef0295be09e6f0178922681a4b6ac4e21396438e2f4faf7ae783cd0489875db677f48f4765577231173a7f6a181607c42d804ebffb351d88a608b2508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "limesuite-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
