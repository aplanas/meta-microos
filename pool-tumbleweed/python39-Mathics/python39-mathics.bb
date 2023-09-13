SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.2"

RPM_NAME = "python39-Mathics-6.0.2-2.1.aarch64.rpm"
RPM_HASH = "4bfba2a3b5da5aab1d9cdfc63173e6b1a469fedd141f080f6917f85752322e282fd0ab5add7dd70640038e87e19bca289d0e9099d760672686987d78be3486ad"

RPROVIDES:${PN} += "python3.9dist-mathics3 \
python39-Mathics \
python39-Mathics3 \
python3dist-mathics3"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
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
