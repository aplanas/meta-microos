SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.5"

RPM_NAME = "python311-unyt-2.9.5-1.3.noarch.rpm"
RPM_HASH = "e44530a815ef741a38bd1134a1a50459c1afe293df5411e32d7fd23bf0fd4c86c6a86183b642afbf132f89b441f4ba648b20688f7061b7dae45a3a2fae1728c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unyt \
python3.11dist-unyt \
python311-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-packaging \
python311-sympy"

inherit rpm
