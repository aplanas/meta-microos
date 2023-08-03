SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python39-octave-kernel-0.35.1-1.6.noarch.rpm"
RPM_HASH = "c7bf0f1cbb4b6c9544a3478acafc322deb4ba2602d363f25f360e1703f5f4d17e203c095c436b6bafd16de68295ac1ddfc29d506efa483f40b78507b9d86beaf"
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
