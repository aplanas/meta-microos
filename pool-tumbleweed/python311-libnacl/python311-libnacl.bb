SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "1.7.2"

RPM_NAME = "python311-libnacl-1.7.2-3.1.aarch64.rpm"
RPM_HASH = "1e79fb75a3ba6891326b87ef011c054e5da35758086087fa99da69e068c0eb31fc25773ca08646c1867b50cf551bbf906bc73dd3bd7262f94d102905dd68463b"

RPROVIDES:${PN} += "python3-libnacl \
python3.11dist-libnacl \
python311-libnacl \
python3dist-libnacl"

RDEPENDS:${PN} += "libsodium23 \
python-abi"

inherit rpm
