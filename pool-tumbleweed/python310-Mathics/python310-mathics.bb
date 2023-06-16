SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.1"

RPM_NAME = "python310-Mathics-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "edd845b0accc97eaf04cba848fc4005584f3215f5a150f099db5bcc3be41bf614618817485e52a5f333017bcce7b56576a55c1270a858715ba855e449cdbb860"

RPROVIDES:${PN} += "python3-Mathics \
python3-Mathics3 \
python3.10dist-mathics3 \
python310-Mathics \
python310-Mathics3 \
python3dist-mathics3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
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
