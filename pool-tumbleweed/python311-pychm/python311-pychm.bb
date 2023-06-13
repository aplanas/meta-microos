SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python311-pychm-0.8.6-1.17.aarch64.rpm"
RPM_HASH = "c97c4b39f7e06d9cccedb2ac125f7c9d8d5b0f7f145867d62045812aa41f541aa1049bc10dafa427bed691daf938c76a035f1aa9d2c4590bef06e6b1cf6843df"

RPROVIDES:${PN} += "python3.11dist(pychm) \
python311-pychm \
python311-pychm(aarch-64) \
python3dist(pychm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libchm.so.0()(64bit) \
python(abi)"

inherit rpm
