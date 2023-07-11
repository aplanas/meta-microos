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

RPM_NAME = "python310-pyppmd-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "c8a296d7b8f23e4abdf9212df1a61c3354fe7b602fe2410a3fd6e0d5c9521193f3e5376b9b2f1b60c544f568abf2633a857792380f0c80e6150dea03fe984ef9"

RPROVIDES:${PN} += "python3.10dist-pyppmd \
python310-pyppmd \
python3dist-pyppmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
