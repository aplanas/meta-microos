SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python39-ligo-lw-1.8.3-2.5.aarch64.rpm"
RPM_HASH = "02ee43ba6e485f927e0ea91541903f0c0f01e7659c9f4659d8bd3708a0b0f9178679013e6910cb4724f0677c7a95add4715fc2ae41fe93da9ed814198c8f75f4"

RPROVIDES:${PN} += "python3.9dist-python-ligo-lw \
python39-ligo-lw \
python3dist-python-ligo-lw"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-PyYAML \
python39-lal \
python39-ligo-segments \
python39-lscsoft-glue \
python39-python-dateutil \
python39-tqdm \
update-alternatives"

inherit rpm
