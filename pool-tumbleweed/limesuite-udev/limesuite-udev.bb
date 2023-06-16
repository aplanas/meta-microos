SUMMARY = "Udev rules for LimeSDR"
DESCRIPTION = "Udev rules for Lime Suite"
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "limesuite-udev-22.09.1-2.2.noarch.rpm"
RPM_HASH = "3fe177fd9800aacf7def4415bafb0670bf1a6545b5d845af41ad9fbc55769abbfb7ee35e66f5a03776a23bdf0a56993d2ac16f4c777da95b58163b3829787fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "limesuite-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
