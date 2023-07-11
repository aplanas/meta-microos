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

RPM_NAME = "python311-pyppmd-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "8996d27568a30bf3e00347ae073a04c0684a647a2ca2dbcfd40794d7aab75b990bed2a734a99f376cf6d0bc174d65d18d00d6e30fa4a55740ca95e32fa8709e5"

RPROVIDES:${PN} += "python3-pyppmd \
python3.11dist-pyppmd \
python311-pyppmd \
python3dist-pyppmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
