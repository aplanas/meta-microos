SUMMARY = "Python3 bindings for splinter"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. \
 \
This package provides the python bindings for splinter."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "python3-splinter-3.0-2.23.aarch64.rpm"
RPM_HASH = "b1139eaad0ad1f33428534775fba5267fa930503dde03d0f4f1222719af76cab8655a1cb17fe513bab28b24beb42993be059c4fc16dae1d801af0f2d2109c11e"

RPROVIDES:${PN} += "python3-splinter \
python3.11dist-splinter \
python3dist-splinter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
