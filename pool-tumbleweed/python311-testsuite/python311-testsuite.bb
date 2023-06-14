SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-testsuite-3.11.3-1.2.aarch64.rpm"
RPM_HASH = "dcdcaa979fd10410b92fc6c142c0cb90f0d75e7055160df6fe0b865548a435d0490ef658d449afea66f0fc5ec78ba7939a96a3d9fb8875fb003ce69d6adb9209"

RPROVIDES:${PN} += "python311-testsuite"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python311 \
python311-tk"

inherit rpm
