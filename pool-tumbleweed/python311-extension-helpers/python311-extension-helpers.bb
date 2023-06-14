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

RPM_NAME = "python311-extension-helpers-1.0.0-1.10.noarch.rpm"
RPM_HASH = "429a1729c7160d6b383614618e471517ce45caa77a3738033ab18e1da7902649257e9dec6034400510c7f1027766a015b765618a40f3a870adc6791ea621891f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-extension-helpers \
python311-extension-helpers \
python3dist-extension-helpers"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
