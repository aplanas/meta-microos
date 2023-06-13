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

RPM_NAME = "python39-extension-helpers-1.0.0-1.10.noarch.rpm"
RPM_HASH = "a8fd580995c2475fff53beaf48404ee61c0ea93424bdeb1a5f1271826ef2db8019a31506e8e58fe144323c8be2dde4a4cc6f8ea8d9432f672db8ebb0df116158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(extension-helpers) \
python39-extension-helpers \
python3dist(extension-helpers)"

RDEPENDS:${PN} += "python(abi) \
python39-setuptools"

inherit rpm
