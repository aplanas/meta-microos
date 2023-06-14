SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "1.7.2"

RPM_NAME = "python311-libnacl-1.7.2-2.8.aarch64.rpm"
RPM_HASH = "9c160fd702c9753def0391d256c506a31d28edad99a1a6289fe60b6a129e544eb873001d3f871119b7a07052bbf99a0a0455b930028b0b761e4b8e5a523edcfd"

RPROVIDES:${PN} += "python3.11dist-libnacl \
python311-libnacl \
python3dist-libnacl"

RDEPENDS:${PN} += "libsodium23 \
python-abi"

inherit rpm
