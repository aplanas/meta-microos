SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "1.7.2"

RPM_NAME = "python310-libnacl-1.7.2-2.8.aarch64.rpm"
RPM_HASH = "97e627948473d97d8555afb0a69bc25be9db9000c043e9a307f12cca4dcec268b9db96fefd1ece1f1473e5b540b23a657a5799aa6284e3c2992e541f78746b02"

RPROVIDES:${PN} += "python3-libnacl \
python3.10dist(libnacl) \
python310-libnacl \
python310-libnacl(aarch-64) \
python3dist(libnacl)"

RDEPENDS:${PN} += "libsodium23 \
python(abi)"

inherit rpm
