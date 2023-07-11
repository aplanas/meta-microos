SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0+"

PV = "0.10"

RPM_NAME = "python310-pymad-0.10-1.28.aarch64.rpm"
RPM_HASH = "4d7233d4435c07de8a0326de02e14f9500bc5ffb8484a242e54d8222323bac6c01eb0d86b7cd71deef49de52893e37239f239d893cb6e344db45e289d16b3a60"

RPROVIDES:${PN} += "python3.10dist-pymad \
python310-pymad \
python3dist-pymad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmad.so.0 \
python-abi"

inherit rpm
