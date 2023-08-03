SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.2"

RPM_NAME = "python310-Mathics-6.0.2-1.1.aarch64.rpm"
RPM_HASH = "7bee16a902a77161a17bffcae6f08f55753568061303c7a4281cad09a87cf221cf55e5e51ec630278fa0283dd2914095ba7b2d1cfef99a7dae974a85a4aabd82"

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
