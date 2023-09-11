SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-testsuite-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "903fff15bc25ee6e664953b41efb2d7497e26601b24bb30016192080dc0cf37d0cdd813bc4a0becd9a439a2f87d942ac355a9b0834d2f5b5d0170b2fb2f58971"

RPROVIDES:${PN} += "python310-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python310 \
python310-tk"

inherit rpm
