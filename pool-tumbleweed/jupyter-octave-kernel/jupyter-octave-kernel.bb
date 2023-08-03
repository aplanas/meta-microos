SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "jupyter-octave-kernel-0.35.1-1.6.noarch.rpm"
RPM_HASH = "1e0e0f7854572d93e30ddcd7eb8b607ca7ba812c167bb7f6b3215791a0f392db2e33b9c3ca8bce37d3204c497e289e264349e3ff7736a8a01be2bad8808daaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-octave-kernel"

RDEPENDS:${PN} += "jupyter-notebook \
python3-octave-kernel"

inherit rpm
