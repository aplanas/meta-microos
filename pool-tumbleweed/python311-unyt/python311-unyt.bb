SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.5"

RPM_NAME = "python311-unyt-2.9.5-1.1.noarch.rpm"
RPM_HASH = "1c132296870d494b330776c12dd93e74fba1c0161d9f6153df1e5268485758f929c74f9bcc77195ad7442392690b6518e5f13aebc7eed87475c9f64b0203e62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unyt) \
python311-unyt \
python3dist(unyt)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-packaging \
python311-sympy"

inherit rpm
