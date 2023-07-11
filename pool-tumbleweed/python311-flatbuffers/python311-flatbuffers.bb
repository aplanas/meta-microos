SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "python311-flatbuffers-23.3.3-2.2.noarch.rpm"
RPM_HASH = "5ed9b9eb467dd9c146b1a3c298a652028e46a578d3140ff19a58f30822a1d06f0532692be400422933cf7b56d54cc6f79ac926f8314b9619082bd960aa229604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flatbuffers \
python3.11dist-flatbuffers \
python311-flatbuffers \
python3dist-flatbuffers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
