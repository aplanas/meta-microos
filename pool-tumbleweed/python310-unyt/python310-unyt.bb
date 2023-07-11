SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.5"

RPM_NAME = "python310-unyt-2.9.5-1.3.noarch.rpm"
RPM_HASH = "d692574748cc5a2de034be0aebf80064ae915cf15101cb704b72fa9682640a41d192a97640fb49cffc8338d1ab3ef98d2c1928c714b4012fb1553d37f2a2e67b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unyt \
python310-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-packaging \
python310-sympy"

inherit rpm
