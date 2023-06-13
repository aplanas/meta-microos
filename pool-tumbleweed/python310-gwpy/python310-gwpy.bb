SUMMARY = "A python package for gravitational-wave astrophysics"
DESCRIPTION = "GWpy is a collaboration-driven Python package providing tools for \
studying data from ground-based gravitational-wave detectors. \
 \
GWpy provides a user-friendly, intuitive interface to the common \
time-domain and frequency-domain data produced by the LIGO and Virgo \
observatories and their analyses, with easy-to-follow tutorials at each \
step."
LICENSE = "GPL-3.0-only"

PV = "2.1.5"

RPM_NAME = "python310-gwpy-2.1.5-1.1.noarch.rpm"
RPM_HASH = "0c878988a608bf1ba9c925687a4eafbbd95e376cc87af8d8b28b9fb53cebf499d5323aef964579192141daa9925c2d40c71f9a671946657ed3c8faa294623ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwpy \
python3.10dist(gwpy) \
python310-gwpy \
python3dist(gwpy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-astropy \
python310-dqsegdb2 \
python310-gwosc \
python310-h5py \
python310-lal \
python310-ligo-segments \
python310-matplotlib \
python310-numpy \
python310-python-dateutil \
python310-requests \
python310-scipy \
python310-tqdm \
update-alternatives"

inherit rpm
