SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.5"

RPM_NAME = "python39-unyt-2.9.5-1.3.noarch.rpm"
RPM_HASH = "1eb715f3a5368f9e916d910dc19bdd6d8b9f5edbd68d82a3b0ae0bffd3b8af62f24ed13d8ae1b8b6976fc161cdefab585a88f023020143adf67ac99aaac09615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unyt \
python39-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-packaging \
python39-sympy"

inherit rpm
