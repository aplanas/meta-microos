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

RPM_NAME = "python310-extension-helpers-1.0.0-1.10.noarch.rpm"
RPM_HASH = "2744c2ffb6cac5d51f4fab4cb83a4b10a1a50932e2dd9d33816dbf4892cc96eeb2973cb8b667908ec7053a54462e39e7c31c321e17dc585e4c890f656981f307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extension-helpers \
python3.10dist-extension-helpers \
python310-extension-helpers \
python3dist-extension-helpers"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
