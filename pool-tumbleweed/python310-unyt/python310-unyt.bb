SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.5"

RPM_NAME = "python310-unyt-2.9.5-1.1.noarch.rpm"
RPM_HASH = "04a3c95c57cb5718b1479781026d42cdf33992305d85f28e4c1e44e153a0fdb2bafb42c8dfb4bca567f4ab414a50d1a5cf32f420a337074aa23e5bc7b450f67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unyt \
python3.10dist(unyt) \
python310-unyt \
python3dist(unyt)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-packaging \
python310-sympy"

inherit rpm
