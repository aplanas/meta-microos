SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python310-octave-kernel-0.35.1-1.5.noarch.rpm"
RPM_HASH = "3c7b53029ef46f394981e22c187151e0c9bf38504860101fa3cbc55e40234e8fed0151d61da1cc28718d3d855ca314ff4f32d545d61e5d06207dcda2b010885c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-octave-kernel \
python310-jupyter-octave-kernel \
python310-octave-kernel \
python3dist-octave-kernel"

RDEPENDS:${PN} += "jupyter-octave-kernel \
python-abi \
python310-ipykernel \
python310-jupyter-client \
python310-metakernel"

inherit rpm
