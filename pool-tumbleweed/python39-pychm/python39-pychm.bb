SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python39-pychm-0.8.6-2.1.aarch64.rpm"
RPM_HASH = "4f808458318f0a1edc58190d94860b51e537d8e15b898de0d1cce30bbbe1d758f1dda3f89a86f95ca3e8e2c33fbb0d1b4885a8a631d64aa6d763d822c679f029"

RPROVIDES:${PN} += "python3.9dist-pychm \
python39-pychm \
python3dist-pychm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
python-abi"

inherit rpm
