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

RPM_NAME = "python311-extension-helpers-1.0.0-1.12.noarch.rpm"
RPM_HASH = "2c25413ee3e4f9e148f5926cf8b2bfd6d9683314b6ca05483ac945c93d45ef83530631f1b247b91d5e21c1fe2cae33afec2fbb2aa97b3007dcf7d93649798c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-extension-helpers \
python3.11dist-extension-helpers \
python311-extension-helpers \
python3dist-extension-helpers"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
