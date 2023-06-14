SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library. \
 \
This package contains the python files"
LICENSE = "GPL-2.0-or-later"

PV = "9.0.0"

RPM_NAME = "python310-lalapps-9.0.0-1.3.aarch64.rpm"
RPM_HASH = "ad55de83950846c42d0b8ea6d629c367c58c5c2e80cddbd262551ccceab6eddde953e35ecea9d8394d67c317530b001b8f27ca66a05acb34d12ed1b031e4967a"

RPROVIDES:${PN} += "python3-lalapps \
python310-lalapps"

RDEPENDS:${PN} += "python-abi \
python310-h5py \
python310-lal \
python310-lalburst \
python310-lalframe \
python310-lalinference \
python310-lalinspiral \
python310-lalmetaio \
python310-lalpulsar \
python310-lalsimulation \
python310-ligo-lw \
python310-ligo-segments \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
