SUMMARY = "PPMd compression/decompression library"
DESCRIPTION = "The pyppmd module provides classes and functions for compressing and \
decompressing text data, using PPM(Prediction by partial matching) \
compression algorithm which has several variations of implementations. \
PPMd is the implementation by Dmitry Shkarin. PyPPMD use Igor Pavlov's \
range coder introduced in 7-zip. \
 \
The API is similar to Python's bz2/lzma/zlib module. \
 \
Some parts of th codes are derived from 7-zip, pyzstd and ppmd-cffi."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "python39-pyppmd-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "53b8acd3e85f8106b164f4ff0996254978a39f82d931ea6305ef4aa7ef31df8d6fe85ead1be230775a0cb0be6b04b863b0b53283c7230a655a187c1401140f83"

RPROVIDES:${PN} += "python3.9dist-pyppmd \
python39-pyppmd \
python3dist-pyppmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
