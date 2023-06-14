SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library. \
 \
This package contains the python files"
LICENSE = "GPL-2.0-or-later"

PV = "9.0.0"

RPM_NAME = "python39-lalapps-9.0.0-1.3.aarch64.rpm"
RPM_HASH = "48d921e48713435c7f6ba849c6a330a2fa3e7407f2ae86078339a72276d3203426127ac8d667d0737addde882bf3013310f68d8154239c7ea201737b81f26ec6"

RPROVIDES:${PN} += "python39-lalapps"

RDEPENDS:${PN} += "python-abi \
python39-h5py \
python39-lal \
python39-lalburst \
python39-lalframe \
python39-lalinference \
python39-lalinspiral \
python39-lalmetaio \
python39-lalpulsar \
python39-lalsimulation \
python39-ligo-lw \
python39-ligo-segments \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
