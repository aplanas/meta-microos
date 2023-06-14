SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0+"

PV = "0.10"

RPM_NAME = "python311-pymad-0.10-1.26.aarch64.rpm"
RPM_HASH = "8fe5f14b167fe8a0c3bada3d10b766186d383f29d9bfd5e1a221780fc5cd94e71ff40d7901360f6c9f5e7b177e5fe089041053b722a77b69dd3c07b0c901c36a"

RPROVIDES:${PN} += "python3.11dist-pymad \
python311-pymad \
python3dist-pymad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmad.so.0 \
python-abi"

inherit rpm
