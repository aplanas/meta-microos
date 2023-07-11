SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python311-octave-kernel-0.35.1-1.5.noarch.rpm"
RPM_HASH = "81bb91314f801996831bc7b46a10c8b27b8d8bb3e8278956f1e7683121267719cdb7300ffd8461079b56d6bd7a941290033e25073f433055466e387a3cfeacbb"
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
