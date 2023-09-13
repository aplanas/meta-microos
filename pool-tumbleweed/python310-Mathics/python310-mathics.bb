SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.2"

RPM_NAME = "python310-Mathics-6.0.2-2.1.aarch64.rpm"
RPM_HASH = "931d80c3c6dfe6ad3d9e5f03221378f54f278db46d081ef0e3bbefb18aa4df3caca08c1f7bd028d866c330be7ca6a59354759253217fb8d35d085124c6010c02"

RPROVIDES:${PN} += "python3.10dist-mathics3 \
python310-Mathics \
python310-Mathics3 \
python3dist-mathics3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
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
