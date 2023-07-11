SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python39-msgpack-numpy-0.4.8-1.6.noarch.rpm"
RPM_HASH = "572ac60d005250444f7995bb5e8ba4fb86a050315c246777f8eb299e3ff0f0fbba3a645d487afce7fddcc37e0924f51c2fb25c494a3325d3d880b95aefdf18e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msgpack-numpy \
python39-msgpack-numpy \
python3dist-msgpack-numpy"

RDEPENDS:${PN} += "python-abi \
python39-msgpack \
python39-numpy"

inherit rpm
