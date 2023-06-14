SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python39-pychm-0.8.6-1.17.aarch64.rpm"
RPM_HASH = "5d44770a967d7fe7f03cb3ce37222f0eb76a5253deb66ac656a1da92b2ec91fd38c1e48f17fe06623c7e7766bfc98c2219a1095804981eea4998a480cd5122c5"

RPROVIDES:${PN} += "python3.9dist-pychm \
python39-pychm \
python3dist-pychm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
python-abi"

inherit rpm
