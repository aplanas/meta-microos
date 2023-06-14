SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "2.9.5"

RPM_NAME = "python39-unyt-2.9.5-1.1.noarch.rpm"
RPM_HASH = "62f5a32e0bf16e8d6709bf6f4a3acae275d5bcbe0b5829b595b4e3b2b1b27496a3639f2fa7fb65ad99fde52d3c89945e3b16d4039d1165d0cf216d1348496757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unyt \
python39-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-packaging \
python39-sympy"

inherit rpm
