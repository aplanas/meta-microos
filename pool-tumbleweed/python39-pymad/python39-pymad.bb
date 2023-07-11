SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0+"

PV = "0.10"

RPM_NAME = "python39-pymad-0.10-1.28.aarch64.rpm"
RPM_HASH = "685e381087b54f744e5b46fc5597f2c52137859cff52ed4866bb06568c91c355c09dd973033cb25d7b02cce3aa4daa990f289413f383f030ede4292a558775dc"

RPROVIDES:${PN} += "python3.9dist-pymad \
python39-pymad \
python3dist-pymad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmad.so.0 \
python-abi"

inherit rpm
