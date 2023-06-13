SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python39-ligo-lw-1.8.3-2.3.aarch64.rpm"
RPM_HASH = "5a8ec4fe52491860af7faf6601271883958250a8d6f23e0fcb84c3e9c5ae987f730ada07096be9fa5c69995be668c18bbece90e80fe50cdfd3814bce86a4c421"

RPROVIDES:${PN} += "python3.9dist(python-ligo-lw) \
python39-ligo-lw \
python39-ligo-lw(aarch-64) \
python3dist(python-ligo-lw)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-PyYAML \
python39-lal \
python39-ligo-segments \
python39-lscsoft-glue \
python39-python-dateutil \
python39-tqdm \
update-alternatives"

inherit rpm
