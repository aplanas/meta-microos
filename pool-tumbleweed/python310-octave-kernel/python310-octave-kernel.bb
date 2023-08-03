SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python310-octave-kernel-0.35.1-1.6.noarch.rpm"
RPM_HASH = "fb9aeedadd7c6ae8bbf77f3d0b3b8f70f5bd142f9f75b5a85d175560736b8efe6642046465fed555d038de58f64874c4982d93a3374fbb9784a0ab325d36fcb3"
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
