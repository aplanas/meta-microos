SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.1"

RPM_NAME = "python311-pyudev-0.24.1-1.3.noarch.rpm"
RPM_HASH = "eb22218076249b43e1d0ba50c6234a7d96ef4974c028031b46f164ba1b6d50bb522b4c7f5eb84be33b98bf04267c77a5fc98038daa7049439b267dcb1c820754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyudev \
python3.11dist-pyudev \
python311-pyudev \
python3dist-pyudev"

RDEPENDS:${PN} += "libudev1 \
python-abi"

inherit rpm
