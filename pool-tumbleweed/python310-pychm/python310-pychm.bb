SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python310-pychm-0.8.6-2.1.aarch64.rpm"
RPM_HASH = "edbb62da907682d0bf96142964ebe5d671110db256a0ce5dc402272d7a43c4473bc06b20e770bf841495ce9cfcbf6d107acefaacd3b9716ef245933f98f91914"

RPROVIDES:${PN} += "python3.10dist-pychm \
python310-pychm \
python3dist-pychm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
python-abi"

inherit rpm
