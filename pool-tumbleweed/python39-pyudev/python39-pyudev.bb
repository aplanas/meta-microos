SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.1"

RPM_NAME = "python39-pyudev-0.24.1-1.1.noarch.rpm"
RPM_HASH = "9f496884171f9f5383c816332dacf501856f3d1d9374450f6c4440042a079bfa319e37e76a055b7cee8cfcb900a74fe9174a09faaf931d77b4acb4904969a007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyudev \
python39-pyudev \
python3dist-pyudev"

RDEPENDS:${PN} += "libudev1 \
python-abi"

inherit rpm
