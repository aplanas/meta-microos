SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python310-msgpack-numpy-0.4.8-1.4.noarch.rpm"
RPM_HASH = "935eeb5ec4ebb15d6e57f16553cf4048375f6415cc1355b05e744b6012ce1751d0a14486c45fb4ed1a774b322fc69435d7986b143da79d1d735d1ad8a613c51d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msgpack-numpy \
python3.10dist-msgpack-numpy \
python310-msgpack-numpy \
python3dist-msgpack-numpy"

RDEPENDS:${PN} += "python-abi \
python310-msgpack \
python310-numpy"

inherit rpm
