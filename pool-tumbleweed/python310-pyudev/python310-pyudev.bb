SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.1"

RPM_NAME = "python310-pyudev-0.24.1-1.3.noarch.rpm"
RPM_HASH = "c7611fcde7bbd586802d3545ffe412f7b9362ed6ddc7c2c3593e291ffeeff0738e3c073d6969ea401ddf7aae1a562fd2347213631170e028d5acbd1a849ac44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyudev \
python310-pyudev \
python3dist-pyudev"

RDEPENDS:${PN} += "libudev1 \
python-abi"

inherit rpm
