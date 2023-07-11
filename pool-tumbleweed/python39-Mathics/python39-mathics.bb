SUMMARY = "A general-purpose computer algebra system"
DESCRIPTION = "Mathics is a general-purpose computer algebra system (CAS). It is meant to be a free, lightweight alternative to Mathematica."
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-3.0-only & MIT"

PV = "6.0.1"

RPM_NAME = "python39-Mathics-6.0.1-1.2.aarch64.rpm"
RPM_HASH = "21182a02d55890b3cb4fb06981f1b7516e206e2a6e1ccc83c12e164531779d2b51fcdf027249868fd2c5507121c7985eff71a9becdc3571c8dbe53d1afd95c28"

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
