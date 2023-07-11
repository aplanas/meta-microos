SUMMARY = "Utilities for building and installing packages in the Astropy ecosystem"
DESCRIPTION = "A package that includes convenience helpers to assist with building Python \
packages with compiled C/Cython extensions. It is developed by the Astropy \
project but is intended to be general and usable by any Python package. \
 \
This is not a traditional package in the sense that it is not intended to be \
installed directly by users or developers. Instead, it is meant to be accessed \
when the setup.py command is run and should be defined as a build-time \
dependency in pyproject.toml files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-extension-helpers-1.0.0-1.12.noarch.rpm"
RPM_HASH = "e13f39c3867c3d7a745a04e5d471134e394105a269b85888a71cf0816e49caa67ef5a5db0e2e9e67e29441e0112f98a73e135fbf740ca1bc83d9401ba011c616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-extension-helpers \
python39-extension-helpers \
python3dist-extension-helpers"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
