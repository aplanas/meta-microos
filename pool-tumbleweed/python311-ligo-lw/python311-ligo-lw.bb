SUMMARY = "Python LIGO Light-Weight XML I/O Library"
DESCRIPTION = "The LIGO Light-Weight XML format is used extensively by compact object \
detection pipeline and associated tool sets.  This package provides a Python \
I/O library for reading, writing, and interacting with documents in this \
format."
LICENSE = "GPL-3.0-only"

PV = "1.8.3"

RPM_NAME = "python311-ligo-lw-1.8.3-2.5.aarch64.rpm"
RPM_HASH = "af5577b48ff85c420d186f4d67f7b417e72c406c674b9ae96cb66fe63ee6e23d2588499f0c8870e4bfdf37f6092e9d9f443ef5952ca2a13fea7e4e5f9c2146d0"

RPROVIDES:${PN} += "python3-ligo-lw \
python3.11dist-python-ligo-lw \
python311-ligo-lw \
python3dist-python-ligo-lw"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-PyYAML \
python311-lal \
python311-ligo-segments \
python311-lscsoft-glue \
python311-python-dateutil \
python311-tqdm \
update-alternatives"

inherit rpm
