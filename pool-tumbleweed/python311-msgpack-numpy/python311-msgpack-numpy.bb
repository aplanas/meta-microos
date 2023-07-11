SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python311-msgpack-numpy-0.4.8-1.6.noarch.rpm"
RPM_HASH = "b6416436c4168b6fe56a2190f119fe447c3ac7bad083b18971929c0bc2c6bb1f08599d5653ac6c9966e2521f056f25235acf84a3142635d552a8e164f2737a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msgpack-numpy \
python3.11dist-msgpack-numpy \
python311-msgpack-numpy \
python3dist-msgpack-numpy"

RDEPENDS:${PN} += "python-abi \
python311-msgpack \
python311-numpy"

inherit rpm
