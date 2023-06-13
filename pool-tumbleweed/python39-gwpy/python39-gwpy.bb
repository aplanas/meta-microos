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

RPM_NAME = "python39-gwpy-2.1.5-1.1.noarch.rpm"
RPM_HASH = "9ecebc82b00337a01e4d8fb35ab9c9971706c0225a203cadcd79c58380778ac8a09c11f99abb1484f2ff8b707f9dc716653bef4cbc16a933824bc5e129f1973d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gwpy) \
python39-gwpy \
python3dist(gwpy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-astropy \
python39-dqsegdb2 \
python39-gwosc \
python39-h5py \
python39-lal \
python39-ligo-segments \
python39-matplotlib \
python39-numpy \
python39-python-dateutil \
python39-requests \
python39-scipy \
python39-tqdm \
update-alternatives"

inherit rpm
