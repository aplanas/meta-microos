SUMMARY = "VOLK modtool"
DESCRIPTION = "This package provides volk_modtool, used for creating new \
VOLK kernels."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "volk_modtool-3.0.0-1.3.aarch64.rpm"
RPM_HASH = "e2319b9d54964a42c6e45a22507ab2d65ab1fc49602598c2c2cf6488599a9950d6444180925fca7f2f8123e1e24b75d964b25e466c64105fed261edf7e1accf8"

RPROVIDES:${PN} += "volk-modtool"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
