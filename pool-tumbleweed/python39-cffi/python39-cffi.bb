SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python39-cffi-1.15.1-4.3.aarch64.rpm"
RPM_HASH = "4353b12400a315b9fac48ec327c101d9c50170a967a3e07d762ea460c1af19d47d52d13e10a9dfe86286438427c7d98f17c1e97d45c725f559d6f53d02c8fa1b"

RPROVIDES:${PN} += "python3.9dist-cffi \
python39-cffi \
python3dist-cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
python-abi \
python39-pycparser"

inherit rpm
