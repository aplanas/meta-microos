SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.1"

RPM_NAME = "python39-Mathics-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "ded4de30807b939dd8e5d4b2fa98799c9dcb85e9707860c1266d514cbc3fe38782120cf08dc3d65c3385227226b9e572a064c286b832105e98916d2401a86a23"

RPROVIDES:${PN} += "python3.9dist-mathics3 \
python39-Mathics \
python39-Mathics3 \
python3dist-mathics3"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
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
