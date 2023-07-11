SUMMARY = "Concurrent I/O library for Python 3"
DESCRIPTION = "Curio is a library for performing concurrent I/O with coroutines in Python 3."
LICENSE = "BSD-Source-Code"

PV = "1.6"

RPM_NAME = "python39-curio-1.6-3.3.noarch.rpm"
RPM_HASH = "d8582d74337df17fbbb167b5551a2f2390427091b8d3887bcd78a73168394dc0d9b58997d90e9b67eeeb5fa85d58b61d3f1268f32dc529b1b20096cb3ae34a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-curio \
python39-curio \
python3dist-curio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
