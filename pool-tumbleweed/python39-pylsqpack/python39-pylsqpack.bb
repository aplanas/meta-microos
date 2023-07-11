SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.16"

RPM_NAME = "python39-pylsqpack-0.3.16-2.1.aarch64.rpm"
RPM_HASH = "f787e5a324e078cde57c6cab752fcaa91475a0f509126543fb71ee27abbb49892aee9bec6269c34e3e1500ab2b384bdfe882228bbdb9bc26452f22c8ff5af0b5"

RPROVIDES:${PN} += "python3.9dist-pylsqpack \
python39-pylsqpack \
python3dist-pylsqpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
