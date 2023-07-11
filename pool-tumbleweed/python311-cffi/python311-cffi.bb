SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python311-cffi-1.15.1-4.3.aarch64.rpm"
RPM_HASH = "d5c5928b1fa3139c3737b4523b6e8f5d53a6c17d62f38947c92634ab9ab5156d07d5017884e86e9ddf34c67271ebd2235af8a4a9f57cab84dbee2bd5befbca1d"

RPROVIDES:${PN} += "python3-cffi \
python3.11dist-cffi \
python311-cffi \
python3dist-cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
python-abi \
python311-pycparser"

inherit rpm
