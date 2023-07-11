SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python39-octave-kernel-0.35.1-1.5.noarch.rpm"
RPM_HASH = "2ac0df883b7efdd95ec74a8dbfacff635351c651d8eed05a2779aebd3ac5b418ab90f8355f607c352ae863e2748c866d29e09e332b92b5b31d59dc4bcbe691e8"
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
