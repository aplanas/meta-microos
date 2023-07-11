SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.1"

RPM_NAME = "python39-pyudev-0.24.1-1.3.noarch.rpm"
RPM_HASH = "733beccf300f1d1ef3c0378b08a81c91cabbd56d0e2530d173f775d9f51e6936360ec63da9de4d61a808543e942e2b9cb0d86fa4dcfb701250fa855590f9decb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyudev \
python39-pyudev \
python3dist-pyudev"

RDEPENDS:${PN} += "libudev1 \
python-abi"

inherit rpm
