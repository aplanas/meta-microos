SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0+"

PV = "0.10"

RPM_NAME = "python311-pymad-0.10-1.28.aarch64.rpm"
RPM_HASH = "92f550571b7fa71cb850e2d6203a354c6a801805fde7a2df3a77edad7a045763a44e68be6db182fd4191ba0325e82edc9a0084d5a0a6b689ae66f667678f61da"

RPROVIDES:${PN} += "python3-pymad \
python3.11dist-pymad \
python311-pymad \
python3dist-pymad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmad.so.0 \
python-abi"

inherit rpm
