SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python39-msgpack-numpy-0.4.8-1.4.noarch.rpm"
RPM_HASH = "463e47f5b38f55d6bdc8c0385f5398f58362d8458cede750bc854242e648ceb8bd074d9eb46790f918839d89d0da36fc265b9d9f8ce708b43c5eb46f241d223e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(msgpack-numpy) \
python39-msgpack-numpy \
python3dist(msgpack-numpy)"

RDEPENDS:${PN} += "python(abi) \
python39-msgpack \
python39-numpy"

inherit rpm
