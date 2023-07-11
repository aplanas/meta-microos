SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "1.7.2"

RPM_NAME = "python310-libnacl-1.7.2-3.1.aarch64.rpm"
RPM_HASH = "e4b8f110fe320ed9e4bc8080447ebc7de733ae2415c45aa849e4ebdf0dcafd29da7eb96d990cf454d4162611359444f929ac34285f635164e9de4eab67d663ff"

RPROVIDES:${PN} += "python3.10dist-libnacl \
python310-libnacl \
python3dist-libnacl"

RDEPENDS:${PN} += "libsodium23 \
python-abi"

inherit rpm
