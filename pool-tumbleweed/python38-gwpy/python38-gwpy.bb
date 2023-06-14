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

RPM_NAME = "python38-gwpy-2.1.5-1.1.noarch.rpm"
RPM_HASH = "a80b8e32967fa48c766a67002e8dc7a1a231fa5a3ce792a9d169528548dd4254ee13b7a2f3635c024780ffaaf4535d7b99bdc041eaf0f02e57616e34c1da9694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-gwpy \
python38-gwpy \
python3dist-gwpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.8 \
python-abi \
python38-astropy \
python38-dqsegdb2 \
python38-gwosc \
python38-h5py \
python38-lal \
python38-ligo-segments \
python38-matplotlib \
python38-numpy \
python38-python-dateutil \
python38-requests \
python38-scipy \
python38-tqdm \
update-alternatives"

inherit rpm
