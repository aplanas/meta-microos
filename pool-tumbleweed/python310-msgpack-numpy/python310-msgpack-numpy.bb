SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python310-msgpack-numpy-0.4.8-1.6.noarch.rpm"
RPM_HASH = "a27be87c0fcb03455c6c971db45533f1d66192db2745bfaf442a1f83c51e8bb674154ceb6ba7e134483696a42602ee6bc577eef2b2f522433257ff8c411ca4fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-msgpack-numpy \
python310-msgpack-numpy \
python3dist-msgpack-numpy"

RDEPENDS:${PN} += "python-abi \
python310-msgpack \
python310-numpy"

inherit rpm
