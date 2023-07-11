SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python310-ligo-lw-1.8.3-2.5.aarch64.rpm"
RPM_HASH = "98f4a4207aaa6a7bb59acd1b02f470ef959c54e8c291069b25b4ac60ca160e4cd4883224300da44b701e8d937b57a2526bd7c7c72346c70ad55f0b1b1288ec84"

RPROVIDES:${PN} += "python3.10dist-python-ligo-lw \
python310-ligo-lw \
python3dist-python-ligo-lw"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-PyYAML \
python310-lal \
python310-ligo-segments \
python310-lscsoft-glue \
python310-python-dateutil \
python310-tqdm \
update-alternatives"

inherit rpm
