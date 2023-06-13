SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.1"

RPM_NAME = "python311-pyudev-0.24.1-1.1.noarch.rpm"
RPM_HASH = "f1f4088dab79a6725f7ca915a87935c9ce673ab0eb5f45030144ee857be10e8c2ac05b78caa9dc6f2e0de287f531baf39a5d388acffee8dc8cecb3dbfeaa4f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyudev) \
python311-pyudev \
python3dist(pyudev)"

RDEPENDS:${PN} += "libudev1 \
python(abi)"

inherit rpm
