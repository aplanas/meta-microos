SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python311-msgpack-numpy-0.4.8-1.4.noarch.rpm"
RPM_HASH = "1086c7a5fcf9010bceacafa20e6c712d336fa864042accc03be1593171386be17bc53003fd67ed3eb6358a7ae75b1100b68fffa7d5bab592aebd19d9058005eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(msgpack-numpy) \
python311-msgpack-numpy \
python3dist(msgpack-numpy)"

RDEPENDS:${PN} += "python(abi) \
python311-msgpack \
python311-numpy"

inherit rpm
