SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.1"

RPM_NAME = "python310-Mathics-6.0.1-1.2.aarch64.rpm"
RPM_HASH = "d451a0401eb52d786f73dfcb38e954c2f3f501f0bdf8271eea0995b60c0bebe3cb504f92bdb5444f65e642fa7a2ecb2efccf9856f100dcd4735babb9c135717b"

RPROVIDES:${PN} += "python310-Mathics \
python310-Mathics3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python310-Cython \
python310-Django \
python310-Mathics-Scanner \
python310-Pint \
python310-llvmlite \
python310-mpmath \
python310-numpy \
python310-palettable \
python310-python-dateutil \
python310-requests \
python310-sympy \
update-alternatives"

inherit rpm
