SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "jupyter-octave-kernel-0.35.1-1.5.noarch.rpm"
RPM_HASH = "91eac568b1ef6d009788fb684e4253605a6592781a7d4510584d3ad3e24f00c3b3c7e8e31a929dbb3eede3f9948351fc814214345e53e9d347bd4aa7ace9d5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-octave-kernel"

RDEPENDS:${PN} += "jupyter-notebook \
python3-octave-kernel"

inherit rpm
