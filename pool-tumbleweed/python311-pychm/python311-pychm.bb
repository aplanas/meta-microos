SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python311-pychm-0.8.6-2.1.aarch64.rpm"
RPM_HASH = "a5ce6fb6cb57b58e9e16ead72d2dfc360f477cda9133c5844d316b8fff657a4f8a715ec763c5b489650813bfe59291601ef3607b326b5f76da35dc56b350c136"

RPROVIDES:${PN} += "python3-pychm \
python3.11dist-pychm \
python311-pychm \
python3dist-pychm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
python-abi"

inherit rpm
