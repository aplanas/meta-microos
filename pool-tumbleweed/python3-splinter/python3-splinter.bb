SUMMARY = "Python3 bindings for splinter"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. \
 \
This package provides the python bindings for splinter."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "python3-splinter-3.0-2.22.aarch64.rpm"
RPM_HASH = "a4166258d2c260233b501e44e6030631ea3194408ddd40d5aac43b438c0fb4f768c909d13be591556195e5a0aee064eb5eb68c92e310364377c91c638837a740"

RPROVIDES:${PN} += "python3-splinter \
python3-splinter(aarch-64) \
python3.10dist(splinter) \
python3dist(splinter)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
