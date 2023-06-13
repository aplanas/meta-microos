SUMMARY = "MATLAB interface for openEMS"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties. \
 \
This package provides MATLAB interface for CSXCAD."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "CSXCAD-matlab-0.6.2-3.19.noarch.rpm"
RPM_HASH = "6aabdc3eae196d6f0899eac5006bffcd383f2d252892cf22b6217079b1e2472defa47025135d474777c31508799be306f3f9a696e76b333beb0d4f8954666d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "CSXCAD-matlab"

RDEPENDS:${PN} += ""

inherit rpm
