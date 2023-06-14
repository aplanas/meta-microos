SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python39-octave-kernel-0.35.1-1.3.noarch.rpm"
RPM_HASH = "1568841a8ca0692521e6454926cd5c75b13ca7bc385c7f0e1f18a37356d52fa049ed1241db5c6b39340fa663e7f56b2fab71dd52d539e14823aae17e43ea5ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-octave-kernel \
python39-jupyter-octave-kernel \
python39-octave-kernel \
python3dist-octave-kernel"

RDEPENDS:${PN} += "jupyter-octave-kernel \
python-abi \
python39-ipykernel \
python39-jupyter-client \
python39-metakernel"

inherit rpm
