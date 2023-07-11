SUMMARY = "PEP 561 type stubs generator for pybind11 modules"
DESCRIPTION = "Generate stubs for python modules.  There are several tweaks to target \
specifically modules compiled using pybind11"
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python39-pybind11-stubgen-0.12.0-1.5.noarch.rpm"
RPM_HASH = "bba9c440e977036d32646569e4aa1972ffa27d62590d2580db515bba837c2dfe56a185f01ce29e037cfcffd9aaf6c0628666430e11f7f038080058018caa1968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybind11-stubgen \
python39-pybind11-stubgen \
python3dist-pybind11-stubgen"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
