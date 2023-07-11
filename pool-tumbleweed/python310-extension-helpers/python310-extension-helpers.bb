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

RPM_NAME = "python310-extension-helpers-1.0.0-1.12.noarch.rpm"
RPM_HASH = "6e9ab561562f10aac8c7be12c4552b5dc55fd01e766d4d18ebcdcddc2781d03fb7377daab9b1b8147e8e516d29e8e3dba96aff9ee865bf4db42b4541f5691868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-extension-helpers \
python310-extension-helpers \
python3dist-extension-helpers"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
