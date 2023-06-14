SUMMARY = "Library and utility to support 7zip"
DESCRIPTION = "py7zr is a library and utility to support 7zip archive compression, decompression, encryption and decryption written by Python programming language."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "python310-py7zr-0.20.5-1.1.noarch.rpm"
RPM_HASH = "fa863d461996558e62f6efd567b9bbf7c4526452b4e121b2b9635da152d2b71de45f117249341e4917c4546af3cbae4d3455c80e73b65b54d24f7496e64d0937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py7zr \
python3.10dist-py7zr \
python310-py7zr \
python3dist-py7zr"

RDEPENDS:${PN} += "-python310-pyppmd >= 0.18.1 with python310-pyppmd < 1.1.0 \
/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Brotli \
python310-inflate64 \
python310-multivolumefile \
python310-psutil \
python310-pybcj \
python310-pycryptodomex \
python310-pyzstd \
python310-texttable \
update-alternatives"

inherit rpm
