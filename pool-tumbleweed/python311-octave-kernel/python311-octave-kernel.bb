SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python311-octave-kernel-0.35.1-1.6.noarch.rpm"
RPM_HASH = "95688736d03e13ac08285bd91ff20f0c5a7efd2bbcb4e7a78d07d7208901489e4197299bf95506d4f7ff8511e10bcfa3d953c08185ac4e6e334129df9193e793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-octave-kernel \
python3-octave-kernel \
python3.11dist-octave-kernel \
python311-jupyter-octave-kernel \
python311-octave-kernel \
python3dist-octave-kernel"

RDEPENDS:${PN} += "jupyter-octave-kernel \
python-abi \
python311-ipykernel \
python311-jupyter-client \
python311-metakernel"

inherit rpm
