SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.2"

RPM_NAME = "python39-Mathics-6.0.2-1.1.aarch64.rpm"
RPM_HASH = "484266ac282e3673f1b1d2700121ef645bf3fe54f5b20d519a0aca4047cd3006aa75a6fd6e4a898ad256eb7e531a9f3b569c9318f2f90e9275297798728291f8"

RPROVIDES:${PN} += "python39-Mathics \
python39-Mathics3"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python39-Cython \
python39-Django \
python39-Mathics-Scanner \
python39-Pint \
python39-llvmlite \
python39-mpmath \
python39-numpy \
python39-palettable \
python39-python-dateutil \
python39-requests \
python39-sympy \
update-alternatives"

inherit rpm
